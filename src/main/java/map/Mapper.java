package map;

/**
 * This class offer the key from <a href="https://leetcode.com">leetcode</a> and the value from this
 * project.
 *
 * The order or name from this website you get, can find the answer by this project
 */

public class Mapper {

    private Integer order;

    private String name;

    private Class clazz;

    public Mapper(Integer order, String name, Class clazz) {
        this.order = order;
        this.name = name;
        this.clazz = clazz;
    }

    public class Builder {

        public Integer order;

        public String name;

        public Class clazz;

        public Builder buildOrder(Integer order) {
            this.order = order;
            return this;
        }

        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        public Builder buildClazz(Class clazz) {
            this.clazz = clazz;
            return this;
        }

        public Mapper build() {
            return new Mapper(this.order, this.name, this.clazz);
        }
    }

}
