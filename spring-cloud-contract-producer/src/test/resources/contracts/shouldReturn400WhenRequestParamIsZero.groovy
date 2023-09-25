import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return even when number input is even"
    request {
        method GET()
        url("/validate/prime-number") {
            queryParameters {
                parameter("number", "0")
            }
        }
    }
    response {
        status 400
    }
}