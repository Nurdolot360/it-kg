package school;
    public class Course extends Company {
        private String java;
        private String JavaS;

        public Course() {
        }

        public Course(String name, String address, String phoneNumber, String java, String javaS) {
            super(name, address, phoneNumber);
            this.java = java;
            JavaS = javaS;
        }

        public String getJava() {
            return java;
        }

        public void setJava(String java) {
            this.java = java;
        }

        public String getJavaJS() {
            return JavaS;
        }
    }


