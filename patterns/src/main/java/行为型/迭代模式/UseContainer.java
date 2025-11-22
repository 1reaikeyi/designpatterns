package 行为型.迭代模式;

public class UseContainer implements Container{
    public String[] str = new String[10];
    @Override
    public Iterator getIterator() {
        return new UseIterator();
    }
    private class UseIterator implements Iterator {
        int iterator = 0;
        @Override
        public boolean hasNext () {
            if (iterator < str.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next () {
            return str[iterator++];
        }
    }
}
