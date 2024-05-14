package com.dangchph33497.fpoly.buoi3_md18306.BaiTap

class CBGV (hoten: String, tuoi: Int?, quequan: String?, var msgv: String, var luongcung: Float, var lthuong: Float?, var lphat: Float?)
    : Nguoi(hoten, tuoi, quequan) {

    var lThucLinh : Float = 0f
        get() = luongcung + (lthuong?:0f) - (lphat?:0f)

    override fun getThongTin(): String {
        return "CGBV: ${super.getThongTin()} - MSGV: $msgv - Luong Thuc Linh: $lThucLinh"
    }
}