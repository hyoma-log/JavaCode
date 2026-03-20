// javaの四則演算
// public class Hello {
//   public static void main(String[] args) {
//     System.out.println((2 + 3) * 3);
//     System.out.println(2 - 3);
//     System.out.println(2 * 3);
//     System.out.println(2 / 3);
//   }
// }

// 変数にデータを入れる
// public class Hello {
//   public static void main(String[] args) {
//     String name = "world";
//     int a = 10;
//     int b = 20;
//     System.out.println(a + b);
//     System.out.println("Hello, " + name + "!");
//   }
// }

// 文字列データを受け取る
// 文字列データの連結
// 入力された文字列を出力する
import java.util.*; // データを受け取るためのクラスをインポート

public class Hello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next(); // next()は、入力したデータを文字列として受け取る
        System.out.println("hello " + text);
    }
}


