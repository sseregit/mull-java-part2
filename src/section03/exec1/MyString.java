package section03.exec1;

class MyString {

    private byte[] string;

    public MyString() {
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
}
