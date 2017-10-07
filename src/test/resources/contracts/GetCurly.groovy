import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType

Contract.make {
    description "Get curly"
    request {
        url "api/curly"
        method GET()
    }
    response {
        status 200
        headers {
            header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE)
        }
        body(["name": "{setting.name}"])
    }
}