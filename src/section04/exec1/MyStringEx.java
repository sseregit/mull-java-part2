package section04.exec1;

public class MyStringEx extends MyString {

    @Override
    public byte[] onSetString(String param) {
        return "우리귀요미".getBytes();
    }
}
