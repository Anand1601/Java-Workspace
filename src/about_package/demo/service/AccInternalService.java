package about_package.demo.service;

import java.util.UUID;

class AccInternalService {
     public String generateAccID(){
         return UUID.randomUUID().toString();
     }
}
