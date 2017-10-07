import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType

Contract.make {
    description "Get breadcrumb string"
    request {
        url "api/breadcrumb-string"
        method GET()
    }
    response {
        status 200
        body("Home > Settings > Preferences")
    }
}