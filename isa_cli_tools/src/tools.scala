/*  Title:      isa_cli_tools/src/tools.scala

Registration of eval_at and desorry as Isabelle/Scala tools of this component.
*/

package isabelle


class Isa_CLI_Tools extends Isabelle_Scala_Tools(Eval_At.isabelle_tool, Desorry.isabelle_tool)
