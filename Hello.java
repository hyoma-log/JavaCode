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
// import java.util.*; // データを受け取るためのクラスをインポート

// public class Hello {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String text = scan.next(); // next()は、入力したデータを文字列として受け取る
//         System.out.println("hello " + text);
//     }
// }


// 整数を受け取る
// import java.util.*;

// public class Hello {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String text = scan.next();
//         System.out.println(text);
//         int number = scan.nextInt();
//         System.out.println(number * 10);
//         System.out.println("お小遣い" + number + "円");
//     }
// }

// 条件に一致したら処理をする
// import java.util.*;

// public class Hello {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int number = scan.nextInt();
//         if (number > 10) {
//             System.out.println("10より大きい");
//         } else if (number == 10) {
//             System.out.println("10と同じ");
//         } else {
//             System.out.println("10より小さい");
//         }
//     }
// }

// 条件に合わせて処理を変える
// import java.util.*;

// public class Hello {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int number = scan.nextInt();
//         if (number % 2 == 0) {
//             System.out.println("偶数");
//         } else {
//             System.out.println("奇数");
//         }
//     }
// }

// 文字列の一致を判定させる
import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String greeting = scan.next();

        if (greeting.equals("Hello")) {
            System.out.println("こんにちは");
        }
    }
}
