package org.bytebloom


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



fun extractValue(input: String, key: String) : String {
    val lowercase=input.lowercase()
    val spases = input.split(";")
    var spase1 = ""
    for (space in spases) {
        spase1=space.trim()
        for (key in spase1){
            val input1=readLine()?:"".lowercase()
             if (input1.equals(key)){ return input1 }
            else { null } }
 }
    return spase1


}




fun main() {

      val config = """
        userId: user-123; role: admin;
        authToken: token-XYZ-789 ;
        environment : production; expiry: 1672531199  """
   // println("entre the vale")
   // val input1=readLine()?:""
   // extractValue(input1,config)
    println(extractValue(config,"role"))












}