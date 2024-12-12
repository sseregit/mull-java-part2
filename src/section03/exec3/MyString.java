package section03.exec3;

class MyString {

    private static int count = 0;

    private byte[] string;

    private MyString() {
    }

    public MyString(MyString rhs) {
        MyString.count++;
        this.deepCopy(rhs);
    }

    private MyString(String param) {
        this.string = param.getBytes();
    }

    private MyString(int param) {
        this.string = String.valueOf(param).getBytes();
    }

    public static MyString newString(int param) {
        MyString.count++;
        return new MyString(param);
    }

    public static MyString newString(String param) {
        MyString.count++;
        return new MyString(param);
    }

    public static int getCount() {
        return MyString.count;
    }

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

    public void deepCopy(MyString rhs) {
        this.string = rhs.string.clone();
        /*
        this.string = new byte[rhs.length()];
        System.arraycopy(rhs.string, 0, this.string, 0, rhs.string.length);
        */
    }
}