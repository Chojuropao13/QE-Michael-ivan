public class Larik
{
    public static void main (String args[])
    {
        String[]mahasiswa = {"kazuya", "panda"};
        String[]mahasiswa1 = {"lee", "jin"};

        String[] result = new String[mahasiswa.length + mahasiswa1.length];
        System.arraycopy(mahasiswa, 0, result, 0, mahasiswa.length);
        System.arraycopy(mahasiswa1, 0, result, mahasiswa.length, mahasiswa1.length);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}