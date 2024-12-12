package section03.exec2;

class MyString {

    private byte[] string;

    public MyString() {
    }

    public MyString(MyString rhs) {
        this.deepCopy(rhs);
    }

    public MyString(String param) {
        this.string = param.getBytes();
    }

    public MyString(int param) {
        this.string = String.valueOf(param).getBytes();
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
