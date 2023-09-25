import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return even when number input is even"
    request {
        method GET()
        url("/validate/prime-number")
    }
    response {
        body("Null")
        status 200
    }
}