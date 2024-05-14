package com.dangchph33497.fpoly.buoi3_md18306.BaiTap

/**
 * Khoa CNTT – DHKHTN cần quản lý việc thanh toán tiền lương cho các cán bộ giá viên trong khoa. Để quản lý được, khoa cần các thông tin sau:
 *
 * Với mỗi cán bộ giáo viên có các thông tin sau: lương cứng, lương thưởng, tiền phạt, lương thực lĩnh, và các thông tin cá nhân: Họ tên, tuổi, quê quán, mã số giáo viên.
 *
 * Yêu cầu 1: Xây dựng lớp Nguoi để quản lý các thông tin cá nhân của mỗi giáo viên.
 *
 * Yêu cầu 2: Xây dựng lớp CBGV để quản lý các thông tin của các cán bộ giáo viên.
 *
 * Yêu cầu 3: Xây dựng các phương thức thêm, xoá các cán bộ giáo viên theo mã số giáo viên.
 *
 * Yêu cầu 4: Tính lương thực lĩnh cho giáo viên: Lương thực = Lương cứng + lương thưởng – lương phạt.
 **/
fun deleteCBGV(listCBGV : MutableList<CBGV>){
    var maSoGiaoVien : String?
    println("Xóa thông tin Cán Bộ Giáo Viên")
    println("------------------------")
    println("Nhập Mã Cán Bộ Giáo Viên Cần Xóa")
    maSoGiaoVien = readLine().toString()
    for (i in listCBGV.indices) {
        if (listCBGV[i].maSoGiaoVien == maSoGiaoVien) {
            listCBGV.removeAt(i)
            println("Xóa giáo viên với mã số giáo viên $maSoGiaoVien thành công")
            getCBGV(listCBGV)
            return
        }
    }
    println("Cán bộ giáo viên với mã số giáo viên $maSoGiaoVien không tồn tại")
}
fun addCBGV(listCBGV : MutableList<CBGV>){
    var maSoGiaoVien : String?
    var hoTen : String?
    var tuoi : Int?
    var queQuan : String?
    var luongCung : Int?
    var tienPhat : Int?
    var tienThuong : Int?
    println("Thêm Thông Tin Cán Bộ Giáo Viên")
    println("------------------------")
    println("Nhập Mã Cán Bộ Giáo Viên")
    maSoGiaoVien = readLine().toString()
    println("Nhập Họ Tên Cán Bộ Giáo Viên")
    hoTen = readLine().toString()
    println("Nhập Tuổi Cán Bộ Giáo Viên")
    tuoi = readLine()?.toIntOrNull()
    println("Nhập Quê Quán Cán Bộ Giáo Viên")
    queQuan = readLine().toString()
    println("Nhập Lương Cung Cán Bộ Giáo Viên")
    luongCung = readLine()!!.toIntOrNull()
    println("Nhập Tiền Phạt Cán Bộ Giáo Viên")
    tienPhat = readLine()!!.toIntOrNull()
    println("Nhập Tiền Thuong Cán Bộ Giáo Viên")
    tienThuong = readLine()!!.toIntOrNull()

    val cbgv = CBGV(maSoGiaoVien,hoTen,tuoi,queQuan,luongCung!!,tienThuong!!,tienPhat!!)
    listCBGV.add(cbgv)
    println("Thêm cán bộ giáo viên thành công")
    getCBGV(listCBGV)
}
fun getCBGV(listCBGV : MutableList<CBGV>){
    if (listCBGV.isEmpty()) {
        println("Danh sách cán bộ giáo viên đang trống")
        return
    }
    for (i in listCBGV.indices){
        println("Thông Tin $i : ${listCBGV.get(i).getThongTin()} ")
    }
}
fun main () {
    val listCBGV = mutableListOf<CBGV>()
    listCBGV.add(CBGV("PH33487","Huy",20,"Hà Nội",20000,10000,5000))
    listCBGV.add(CBGV("PH33489","Nam",23,"Hà Nội",70000,20000,9000))
    while (true) {
        println("Mời nhập lựa chọn của bạn")
        println("0. Thoát chương trình")
        println("1. Thêm thông tin Cán Bộ Giáo Viên")
        println("2. Xóa thông tin Cán Bộ Giáo Viên")
        val choice = readlnOrNull()?.toIntOrNull()

        when (choice) {
            1 -> {
                println("Bạn chọn thêm thông tin Cán Bộ Giáo Viên")
                addCBGV(listCBGV)
            }
            2 -> {
                println("Bạn chọn xóa thông tin Cán Bộ Giáo Viên")
                deleteCBGV(listCBGV)
            }
            0 -> {
                println("Thoát chương trình")
                return
            }
            else -> println("Lựa chọn $choice không hợp lệ")
        }
    }
}

class Bai7 {

}