package com.dangchph33497.fpoly.buoi3_md18306

fun main(){
    val soA = 5
    var soB = 10

//    with(soB) {
//        soB = this.inc()
//        println("SoB: $soB")
//    }

    val luyThuaBac3CuaA = soA.let {
        val kq = it * it * it
        kq
    }

    val sv1 = SinhVienModel("Long", "PH11321", 8f)
    sv1.apply {
        tenSV = "Tuan"
        diemTB = 9f
    }
    println(sv1)

    val title : String? = "Buổi 3 - Android Kotlin"
    val length = title.let {
        if(it == null){
            0
        }else{
            it.length
        }
    }
    val length2 = title?.run {
        if(isEmpty()){
            0
        }else{
            length
        }
    }
    println("Độ dài chuỗi $title là $length và $length2")
    println(luyThuaBac3CuaA);
    println("Tổng 2 sô $soA + $soB = ${tingTong(soA,soB)}")
    println("Tích 2 sô $soA * $soB = ${phepNhan(soA,soB)}")
    println("Chia 2 sô $soA / $soB = ${phepChia(soA.toFloat(),soB.toFloat()) ()}")
    println("Lũy thừa 2 sô $soA ^ $soB = ${luyThua(soA)}")

}
val tingTong = {soA:Int,soB:Int -> (soA + soB)}

val phepNhan : (Int,Int) -> Int = {soA:Int,soB:Int -> (soA * soB)}

val phepChia = {soA:Float , soB:Float -> {
    if(soB != 0f){
        "Số bi phải khác 0!"
    }else{
        val kq = soA/soB
        kq
    }
}}

val luyThua : (Int) -> Int = {it * it}

