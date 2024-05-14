package com.dangchph33497.fpoly.buoi3_md18306.BaiTap

class CBGV(
    maSoGiaoVien:String?,
    hoTen: String?,
    tuoi: Int?,
    queQuan: String?,
    luongCung: Int,
    tienPhat: Int,
    tienThuong: Int,
) : Nguoi(maSoGiaoVien,hoTen, tuoi, queQuan) {

    var luongCung: Int = luongCung
    var tienPhat: Int = tienPhat
    var tienThuong: Int = tienThuong

    fun getThongTin(): String {
        return """""hoTen=$hoTen - tuoi=$tuoi - queQuan =$queQuan - maSoGiaoVien = $maSoGiaoVien 
            |- luongCung = $luongCung - tienPhat = $tienPhat - luongThucLinh = ${tinhLuongThuc()}- 
            |tienThuong = $tienThuong""""".trimMargin()
    }

    fun tinhLuongThuc(): Int {
        return luongCung + tienPhat + tienThuong
    }

    override fun toString(): String {
        return "CBGV(luongCung=$luongCung, tienPhat=$tienPhat, tienThuong=$tienThuong, luongThucLinh=${tinhLuongThuc()})"
    }


}
