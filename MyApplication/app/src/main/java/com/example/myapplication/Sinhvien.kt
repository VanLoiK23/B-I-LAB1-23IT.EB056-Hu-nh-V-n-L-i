package com.example.myapplication

//data class Sinhvien(val ten:String,val tuoi:Int)
class Sinhvien(hoten:String,DiaChi:String,NamSinh:Int) {
    private var ten:String =""
    private var diachi:String =""
    private var namsinh:Int =0

    //block khoi tao
    init{
        ten=hoten
        diachi=DiaChi
        namsinh=NamSinh
    }

    //contructor
//    constructor(hoten:String,DiaChi:String,NamSinh:Int){
//        ten=hoten
//        diachi=DiaChi
//        namsinh=NamSinh
//    }

}
