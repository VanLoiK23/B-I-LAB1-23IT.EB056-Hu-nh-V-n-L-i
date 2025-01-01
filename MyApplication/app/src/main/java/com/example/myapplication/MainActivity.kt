package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        enableEdgeToEdge()

//        // Khởi tạo View Binding
//
//
//
//        // Chuyển đổi an toàn chuỗi sang số
//        val a = ""
//        val number = a.toIntOrNull() ?: 0
//
//        // Khai báo val tương tự const
//        val b: String = "a"
//
//        // Biến nullable
//        var n: String? = "Phat"
//        n = null
//
//        // Biến không nullable
//        var non: String = "Cuong" // Gán giá trị hợp lệ
//
//        //        Log.v (Verbose): Thông tin rất chi tiết.
////        Log.d (Debug): Thông tin hữu ích khi gỡ lỗi.
////        Log.i (Info): Thông tin quan trọng.
////        Log.w (Warning): Cảnh báo tiềm ẩn lỗi.
////        Log.e (Error): Lỗi nghiêm trọng cần xử lý.
////        Log.wtf (What a Terrible Failure): Log lỗi cực kỳ nghiêm trọng.
//        // Logging
//        val username: String = "GiaHuy"
//        Log.d("MainActivity", "Ứng dụng đã khởi chạy")
//        Log.i("MainActivity", "Người dùng đăng nhập với tên: $username")
//
//        if (username.isEmpty()) {
//            Log.w("MainActivity", "Tên người dùng trống!")
//        }
//
//        try {
//            val result = 10 / 0 // Gây ra lỗi chia cho 0
//        } catch (e: ArithmeticException) {
//            Log.e("MainActivity", "Lỗi: ${e.message}")
//        }
//
//        Log.v("MainActivity", "Chi tiết thêm về trạng thái ứng dụng")
//
//        var num: Int = 5
//
//        when (num) {
//            in 1..3 -> Log.d("MainActivity", "Tháng thuộc quý I")
//            in 4..6 -> Log.d("MainActivity", "Tháng thuộc quý II")
//            in 7..9 -> Log.d("MainActivity", "Tháng thuộc quý III")
//            in 10..12 -> Log.d("MainActivity", "Tháng thuộc quý IV")
//            else -> Log.d("MainActivity", "Số không phải là một tháng hợp lệ")
//        }// tuongw tu switch case
//        //if else while tuong tu java
//
////        for(i in 0..5) lap tu 0 den 5
////        for(i in 0 until 5) lap tu 0 den 4
////        for(i in 5 downTo 0 ) lap tu 5 den 0
//
////        for(i in 0.. 10 step 9) lap voi buoc nhay +9
//        // Xử lý insets với kiểm tra null
//
//        var mangso: IntArray = intArrayOf(1, 3, 34, 3)
//        mangso.get(4)
//
//        var mangten: List<String> = listOf("Hoa", "Huy")
//        mangten.get(2)
//
//        var mangten1: ArrayList<String> = ArrayList()
//        mangten1.add("Huy")
//        mangten1.add("Hoa")
//        mangten1.add("Doan")
//
//        mangten1.remove("Hoa")
//
//        //alter
//        mangten1.set(1, "Hoa Ok")
//
//        mangten1.size

        super.onCreate(savedInstanceState)
        setContent {
            GreateMessage()
        }
    }
 @Composable
fun Message(name:String){
    Text("Hello $name")
}
    @Preview(name = "Hello test", showBackground = true, backgroundColor = 0xFFFFFF00,widthDp = 300,
        heightDp = 100)
    @Composable
    fun GreateMessage(){
        Message("Gia Huy")
    }



}