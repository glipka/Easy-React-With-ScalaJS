/*
 # Copyright 2016 Georges Lipka
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
*/
/*# Copyright 2016 Georges Lipka
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
*/
package react.xml

import scala.annotation.StaticAnnotation
import scala.language.experimental.macros
import scala.reflect.macros.whitebox
import scala.xml._
import scala.reflect.macros.whitebox.Context
import scala.annotation.compileTimeOnly
import scala.util.matching.Regex
import scala.util.control.Exception
import java.io.FileOutputStream
import java.io.BufferedOutputStream
import java.io.FileWriter
import java.io.File
import java.util.Dictionary
import scala.scalajs.js
import react._

//object ConvertJsxToCreatElement {
//  def apply(elem: Elem): Any = macro TransFormJSX.apply
//}
@compileTimeOnly("enable macro paradise to expand macro annotations")
class RetrieveMembersDefinition(verbose: Boolean = false, suppressNullChildren: Boolean = false) extends StaticAnnotation {
  def macroTransform(annottees: Any*): Any = macro JsxImpl2.macroTransform
}

object JsxImpl2 {
  // val catalogueDesParametres = scala.collection.mutable.Map[String, String]()
  def macroTransform(c: Context)(annottees: c.Expr[Any]*): c.Expr[Any] = {
    import c.universe._

    val h = new MacroTransform2[c.type](c)
    val newTrees = annottees.map(expr => h.transform(expr.tree))

    val verbose = c.macroApplication match {
      case q"new $x($arg).macroTransform(..$y)" => c.eval(c.Expr[Boolean](arg))
      case _ => false
    }

    if (verbose) {
      val msg = newTrees.mkString("\n\n\n")

      c.info(c.enclosingPosition, msg, force = true)
    }

    c.Expr[Any](q"..$newTrees")
  }

}
 

private class MacroTransform2[C <: Context](val c: C) {

  import c.universe._
  val file = new File("c:/temp/georges1.txt");
  // creates the file
  file.createNewFile();
  // creates a FileWriter Object
  val writer = new FileWriter(file);
  // Writes the content to the file

  def transform(tree: Tree): Tree = {
    // parse of the code and if error => return code not parsed and error code

    val transformed = ElemTransformer.transform(tree) // on passe une Map vide de paramÃƒÆ’Ã‚Â¨tre
    writer.close
    return transformed

  }

  class HasType[T](implicit t: c.WeakTypeTag[T]) {

    def matches(tree: Tree) = {
      c.Expr(c.typecheck(tree, silent = true)).actualType =:= t.tpe ||
        c.Expr(c.typecheck(tree, mode = c.TYPEmode, silent = true)).actualType =:= t.tpe
    }

    def unapply(tree: Tree): Option[Tree] = {
      if (matches(tree)) Some(tree)
      else None
    }
  } 
  

  val hasNodeBufferType = new HasType[NodeBuffer]
  val scalaXmlNull = new HasType[scala.xml.Null.type]
  val hasMetaDataType = new HasType[MetaData]
  val hasElemType = new HasType[Elem]
  val hasTextType = new HasType[Text]
  val hasStringType = new HasType[String]
  val hasAttributeType = new HasType[UnprefixedAttribute]
  val catalog = scala.collection.mutable.Map[String, String]()

  def isWhitespace(str: String) = new Regex("""^\s*$""", "m").unapplySeq(str).isDefined

  object ElemTransformer extends Transformer {
   
    override def transform(tree: Tree): Tree = {
      tree match {

        case q"$mods val $name: $className  " =>
          writer.write(s" name=$name className=$className ***")
          val class1= c.mirror.staticClass(className.toString)
          
          val classInfo = class1.info  
          val members=classInfo.members
          
          members.foreach { symbol =>          
         /*   if (symbol.isMethod ) */ writer.write("memberMethod:" + symbol.name + " " + symbol.typeSignature + "\r\n")
           
          }
        //  writer.write("members=" +members.toString())
          
          
          
      //    classInfo.paramLists.foreach { symbol => writer.write("paramlist=" + symbol) }
          writer.write(s"className=" + class1.name)
          q""

        // on filtre le cas $buf 
        case _ =>
          writer.write("cas_:" + tree.toString() + "\r\n")
          super.transform(tree)
      }
    }
  }

}
 
 
 