public class hoples {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 3, 3, 6, 9, 9};
        int[] array2 = {2, 2, 2, 11};

        // mencetak jumlah elemen setelah menghapus angka duplikat
        int len1 = removeDuplicates(array1);
        System.out.println("Output 1 : " + len1);

        int len2 = removeDuplicates(array2);
        System.out.println("Output 2 : " + len2);
    }

    // Method untuk menghapus angka duplikat pada array
    public static int removeDuplicates(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        //inisialisasi indeks untuk angka yang belum diulang
        int nextNonDuplicate = 1;

        //memeriksa setiap elemen dalam array
        for (int i = 1; i < array.length; i++) {
            //jika angka tidak sama dengan angka sebelumnya
            if (array[nextNonDuplicate - 1] != array[i]) {
                //maka tambahkan angka ini ke indeks berikutnya di array
                array[nextNonDuplicate] = array[i];
                //lalu perbarui indeks untuk angka yang belum diulang
                nextNonDuplicate++;
            }
        }

        //mengembalikan panjang array setelah menghapus angka duplikat
        return nextNonDuplicate;
    }
}
