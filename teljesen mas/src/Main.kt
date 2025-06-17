//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val a_nevem: String ="Laci"
    println("az én nevem"+a_nevem+"!")
    var szam: Float = 16f
    println(szam)
szam=60f
    println(szam)
    var szam_2: Float = 15f
    println(szam + szam_2)
    println(szam - szam_2)
    println(szam / szam_2)
    println(szam * szam_2)
    println(16+5 + szam + szam_2)
    println("az én nevem ${a_nevem}!")
    println("${szam.toInt()}+${szam_2.toInt()} =${szam + szam_2.toInt()}")
    println("${szam.toInt()}-${szam_2.toInt()} =${szam.toInt() - szam_2.toInt()}")
    println("${szam.toInt()}/${szam_2.toInt()} =${szam.toInt()/ szam_2.toInt()}")
    println("${szam.toInt()}*${szam_2.toInt()} =${szam.toInt() * szam_2.toInt()}")
    print("kérlek írj ide valamit")
    var bekert_szoveg = readln()
    if (bekert_szoveg.isEmpty()) {
        println("Hiba nem adtál meg semmit")
    }
    if (!bekert_szoveg.isEmpty()) {
            println(bekert_szoveg)
        }




}