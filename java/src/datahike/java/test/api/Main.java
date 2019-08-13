package datahike.java.test.api;

import datahike.java.api.Api;

// TODO: to-delete
// (let [uri "datahike:mem://test-empty-db"
//       _ (d/delete-database uri)
//       _ (d/create-database uri)
//       conn (d/connect uri)
//       db (d/db conn)
//       tx [{:name "Alice"}]]

//   (is (= {:db/ident {:db/unique :db.unique/identity}} (:schema db)))

//   (testing "transact without schema present"
//     (is (thrown-msg?
//          "No schema found in db."
//          (d/transact! conn tx))))



// To run it: java -cp target/datahike-0.2.0-beta3-standalone.jar datahike.java.test.api.Main
public class Main {
    public static void main(String[] args) {
        String uri = "datahike:mem://test-empty-db";
        Api.createDatabase(uri);
        Api.connect(uri);
    }
}
