public class User {
        private String id;
        private String username;
        Address address;


        // Getter Methods

        public String getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public Address getAddress() {
            return address;
        }

        // Setter Methods

        public void setId(String id) {
            this.id = id;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setAddress(Address addressObject) {
            this.address = addressObject;
        }
    }

