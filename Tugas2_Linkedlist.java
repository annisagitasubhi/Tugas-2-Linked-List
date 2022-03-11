package TugasSDA2;

import java.util.LinkedList;

public class Tugas2_Linkedlist {
    public static void main(String[] args) {
        
        //membuat linked list
        LinkedList<String> saya = new LinkedList<>();

        //menambahkan elemen
        saya.add("A");
        saya.add("N");
        saya.add("N");
        saya.add("I");
        saya.add("S");
        saya.add("A");
        saya.add(" ");
        saya.add("G");
        saya.add("I");
        saya.add("T");
        saya.add("A");
        saya.add(" ");
        saya.add("S");
        saya.add("U");
        saya.add("B");
        saya.add("H");
        saya.add("I");

        System.out.println("Output : " +saya);
        System.out.println("---------------------------------------");

        //perintah 1 : add karakter lain yang diinginkan
        System.out.println("PERINTAH 1 - ADD KARAKTER LAIN");
        saya.addFirst("TUGAS 2 SDA LinkedList");
        saya.add(1, "1");
        saya.addLast("2111522011");
        System.out.println("Output Baru : "+saya);
        System.out.println("---------------------------------------");

        //perintah 2 : sisipkan karakter lain yang diinginkan
        System.out.println("PERINTAH 2 - SISIPKAN KARAKTER LAIN");
        saya.set(6, "T");
        saya.set(11, "N");
        System.out.println("Output Baru : "+saya);
        System.out.println("---------------------------------------");

        //perintah 3 : hapus beberapa karakter yang diinginkan
        System.out.println("PERINTAH 3 - HAPUS BEBERAPA KARAKTER");
        saya.removeFirst();
        saya.remove("1");
        System.out.println("Output Baru : "+saya);
        System.out.println("---------------------------------------");

        //perintah 4 : fungsi push dan pop
        System.out.println("PERINTAH 4 - FUNGSI PUSH DAN POP");
        System.out.println("PERINTAH PUSH");
        saya.push("R");
        saya.push("F");
        System.out.println("Output Baru : "+saya);

        System.out.println("PERINTAH POP");
        saya.pop();
        System.out.println("Output Baru : "+saya);
    }
}