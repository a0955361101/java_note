// 每個 java 程序都有一個 class 必須與文件名稱匹配,並每個個程序都必須包含 main() 方法
public class Main {
    public static void main(String[] args){
        // System 內置的 java 類
        // println() 印出值 會有換行的效果
        System.out.println("Hello World");
        System.out.println("I am learning Java");
        System.out.println("It is awesome");
        System.out.println(87);
        System.out.println(1 + 1);
        System.out.println(1 * 2);
        // print() 印出值 但不會換行
        System.out.print("Hello World! ");
        System.out.print("I will print on the same line.");

        // 變數
        // String - "content"
        // int - 存整數,不帶小數. 例: 123 or -123
        // float - 存浮點數,帶小數. 例: 3.21 or -3.21
        // char - 存單個字符 例: a 或 B 需用單引號括起來
        // boolean - true 或 false 

        // 聲明變數的方法
        String variableName = "value";
        System.out.println(variableName);

        String name = "shadow";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        // 可以先聲明變數,再賦值
        int myNumber;
        myNumber = 20;
        System.out.println(myNumber);

        // 使用關鍵字 final 意味著不可更改且只讀 
        final String myName = "B";
        System.out.println(myName);

        // 變量組合
        String newName = name + myName;
        System.out.println(newName);

        int x = 5;
        int y = 6;
        System.out.println(x + y);

        // 相同類型聲明多個變數
        int a = 5,  b = 6,  c = 50;
        System.out.println(a + b + c);

        // 一個值對應多個變數
        int d, e, f;
        d = e = f = 50;
        System.out.println(d + e + f);

        // 數字 
        // 整數類型
        // byte數據類型可以存儲從 -128 到 127 的整數。int當您確定該值在 -128 到 127 之間時，可以使用它代替或其他整數類型來節省內存
        byte myByte = 100;
        System.out.println(myByte);

        // short數據類型可以存儲從-32768到32767的整數
        short myShort = 5000;
        System.out.println(myShort);

        // int數據類型可以存儲從 -2147483648 到 2147483647 的整數。一般來說，在我們的教程中，int當我們創建具有數值的變量時，該數據類型是首選數據類型。
        int myInt = 100000;
        System.out.println(myInt);

        // long數據類型可以存儲從 -9223372036854775808 到 9223372036854775807 的整數。當 int 不足以存儲該值時使用此類型。請注意，您應該以“L”結束該值
        long myLong = 15000000000L;
        System.out.println(myLong);

        // 浮點類型
        // float類型double可以存儲小數。請注意，對於浮點型，應以“f”結尾，對於雙精度型，應以“d”結尾
        float myFload = 5.75f;
        System.out.println(myFload);
        double myDouble = 19.99d;
        System.out.println(myDouble);
        // 使用float或double？
        // 浮點值的精度表示該值小數點後可以有多少位。的精度float只有六位或七位小數，而double變量的精度約為15位。因此，對於大多數計算來說使用它更安全double

        // 科學數字
        // 浮點數也可以是科學數，用“e”表示 10 的冪
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
    }
}

// 如何運行代碼
// cmd 輸入 javac Main.java
// 這將編譯代碼 如果沒有錯誤的話
// 輸入 java Main 來運行這個文件
// output 為 Hello World



