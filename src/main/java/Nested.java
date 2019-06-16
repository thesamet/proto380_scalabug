package jpkg;

public class Nested implements NestedBuilder {
  public Nested.Nested2.Nested3.Nested4 getNested4() { return null; }

  static public class Nested2 {
    private Nested2() { }

    public static final class Builder2 {
      public Nested2 buildPartial() {
        return new Nested2();
      }
    }

    static public class Nested3 {
      private Nested3() { }

      public static final class Builder3 {
        public Nested3 buildPartial() {
          return new Nested3();
        }
      }

      static public class Nested4 { }
    }
  }
}

