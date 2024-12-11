package section02;

public class Main {

    public static void main(String[] args) {
        MyString str = new MyString();
        System.out.println(str.length());
        System.out.println(str.getString());

        str.setString("Hello Java");
        System.out.println(str.getString());
        System.out.println(str.length());
        System.out.println(str.compareTo("Hello Java"));
    }

    private static class MyString {

        private byte[] string;

        public int length() {
            if (this.string == null) {
                return 0;
            }

            return string.length;
        }

        public String getString() {
            if (this.length() == 0) {
                return "(null)";
            }

            return new String(string);
        }

        public void setString(String param) {
            this.string = param.getBytes();
        }

        public int compareTo(String param) {
            return param.compareTo(this.getString());
        }
    }
}
