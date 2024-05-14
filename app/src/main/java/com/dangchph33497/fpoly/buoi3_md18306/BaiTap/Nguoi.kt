package com.dangchph33497.fpoly.buoi3_md18306.BaiTap


open class Nguoi(var hoten: String, var tuoi: Int?, var quequan: String?) {
    open fun getThongTin () : String {
        return "$hoten - Tuoi: $tuoi - Que: $quequan"
    }

}