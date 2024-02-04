public class BloomFilter {

    private final boolean[] filter;

    public BloomFilter(int filterSize) {
        this.filter = new boolean[filterSize];
    }

    public BloomFilter() {
        this.filter = new boolean[100];
    }


    /**
     *  Basically, only english letters allowed for simplicity.
     */
    public void add(String value){
        setAllFilters(value.toLowerCase());
    }


    public boolean isBlocked(String value){
        value = value.toLowerCase();
        return filter[getFilter1(value)] && filter[getFilter2(value)];
    }


    private void setAllFilters(String value){
        filter[getFilter1(value)] = true;
        filter[getFilter2(value)] = true;
    }


    private int getFilter1 (String value){
        return value.hashCode() % filter.length;
    }


    private int getFilter2 (String value){
        return CustomFilterGenerator.toNumber(value) % filter.length;
    }
}
