package ua.artcode.utils;

public class MyString implements Comparable<MyString> {

    private char[] arr;

    public MyString(char[] arr) {
        this.arr = arr;
    }

    public MyString(String userString) {
        arr = userString.toCharArray();
    }

    public char[] getArr() {
        return arr;
    }

    public int length(){
        return arr.length;
    }

    //конкатенация
    public void concatArrays(char[] userArray){
        int size = arr.length + userArray.length;
        char[] bigArray = new char[size];
        for(int i = 0; i < arr.length; i++){
            bigArray[i] = arr[i];
        }
        for(int i = arr.length; i < size; i++){
            bigArray[i] = userArray[i-arr.length];
        }
        arr = bigArray;
    }

    //- понижение регистра
    public void toLowCase(){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 65 && arr[i] <=90 || arr[i] >= 1040 && arr[i] <= 1071) arr[i] += 32;
        }
    }

    //- повышение регистра
    public void toUpCase(){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 97 && arr[i] <= 122 || arr[i] >= 1072 && arr[i] <= 1103) arr[i] -= 32;
        }
    }

    //поиск подстроки c параметром типа String
    public int substringSearch(String substring){
        char[] subArr = substring.toCharArray();
        for(int i = 0; i <= arr.length-subArr.length; i++){
            if(arr[i] == subArr[0]){
                for(int j = 1; j < subArr.length; j++){
                    if(arr[i+j]!=subArr[j])break;
                }
                return i;
            }
        }
        return -1;
    }

    //поиск подстроки c параметром типа MyString
    public int substringSearch(MyString substring){
        char[] subArr = substring.getArr();
        for(int i = 0; i <= arr.length-subArr.length; i++){
            if(arr[i] == subArr[0]){
                for(int j = 1; j < subArr.length; j++){
                    if(arr[i+j]!=subArr[j])break;
                }
                return i;
            }
        }
        return -1;
    }

    //- выделение подстроки
    public  String substringOut(int beginIndx, int endIndx){
        String substring = "";
        int size = endIndx - beginIndx;
        if(size > 0 && endIndx <= arr.length){
            char[] tmp = new char[size];
            for(int i = beginIndx; i < endIndx; i++){
                tmp[i-beginIndx] = arr[i];
            }
            substring = String.valueOf(tmp);
        }else{
            System.err.println("Index out of bounds or invalid size of the desired substring!");
        }
        return substring;
    }

    //- удаление пробелов
    public void removGaps(){
        int count = 0,index = 0;
        for(char a : arr){
            if(a == ' ') count++;
        }
        char[] tmpArr = new char[arr.length - count];
        for(char a : arr){
            if(a!=' ')tmpArr[index++]=a;
        }
        arr = tmpArr;
    }

    //- метод для сравнения с другой строкой
    public int comparingStrings(String anotherString){
        char[] userArr = anotherString.toCharArray();
        int min = Math.min(arr.length, userArr.length);
        for(int i = 0; i < min; i++){
            if(arr[i] != userArr[i])return arr[i] - userArr[i];
        }
        return arr.length - userArr.length;
    }

    //- метод для сравнения с другой строкой на эквивалентность
    public boolean equalsString(String anotherString){
        char[] userArray = anotherString.toCharArray();
        boolean result = false;
        if(arr.length == userArray.length){
            for(int i = 0; i<arr.length; i++){
                if(arr[i] != userArray[i]) return result;
            }
            result = true;
        }
        return result;
    }

    //- вывод на экран
    public void showString(){
        System.out.print("\"");
        for(char i : arr){
            System.out.print(i);
        }
        System.out.println("\"");
    }

    @Override
    public String toString() {
        return String.valueOf(arr);
    }


    @Override
    public int compareTo(MyString o) {
        return this.length() - o.length();
    }
}
