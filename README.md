## 安裝java [oracle](https://www.oracle.com/java/technologies/java-se-glance.html)

### windows 設置 :

1. windows 鍵 + R 輸入 sysdm.cpl
2. 選進階 -> 環境變數 -> 在系統變數那 點擊新增
3. 變數名稱 JAVA_HOME 變數值為安裝的路徑,未更改的情況下應該會是C:\Program Files\Java\jdk-所安裝的 jdk 版本
4. 接下來編輯系統變數裡面的 Path 在 Path 最下面新增 %JAVA_HOME%\bin
5. 打開 cmd 輸入 ava -version 如果順利顯示 "javac 版本號",表示 JDK 已正確的設定完成


### 命名變量的一般規則是：

1. 名稱可以包含字母、數字、下劃線和美元符號
2. 名稱必須以字母開頭
3. 名稱應以小寫字母開頭，且不能包含空格
4. 名稱也可以以 $ 和 _ 開頭
5. 名稱區分大小寫（“myVar”和“myvar”是不同的變數）
保留字（如 Java 關鍵字，如int或 boolean）不能用作名稱

### 原始數據類型 :
原始數據類型指定變量值的大小和類型，並且沒有附加方法。

| Data Type | Size | Description |
| --------- | ---- | ----------- |
| byte | 1byte | Stores whole numbers from -128 to 127 |
| short | 2bytes | Stores whole numbers from -32,768 to 32,767 |
| int | 4bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647 |
| long | 8bytes | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float | 4bytes | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits |
| double | 8bytes | Stores fractional numbers. Sufficient for storing 15 decimal digits |
| boolean | 1bit | Stores true or false values |
| char | 2bytes | Stores a single character/letter or ASCII values |

### 非原始數據類型

1. 原始數據類型和非原始數據類型之間的主要區別是：
2. 基本類型在 Java 中是預定義的（已經定義的）。非原始類型是由程序員創建的，不是由 Java 定義的（除了String）。
3. 非基本類型可用於調用方法來執行某些操作，而基本類型則不能。
4. 原始類型總是有一個值，而非原始類型可以是null。
5. 基本類型以小寫字母開頭，而非基本類型以大寫字母開頭。

### Java 類型轉換

在Java中，有兩種​​類型的轉換：
1. 加寬鑄造（自動） - 將較小的類型轉換為較大的類型尺寸
byte-> short-> char-> int-> long-> float->double
2. 縮小鑄造（手動）- 將較大類型轉換為較小尺寸類型
double-> float-> long-> int-> char-> short->byte