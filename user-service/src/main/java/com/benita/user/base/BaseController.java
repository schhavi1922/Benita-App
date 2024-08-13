package com.benita.user.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BaseController {

//    @Autowired
//    private UserRepository userRepository;
//
//    public User getUserNameByHeader(HttpServletRequest request) {
//        log.info("Executing getUserNameByHeader()");
//        User user = null;
//        try {
//            String uri = "http://localhost:8883/oauth-server/private/getUserDetails";
//            RestTemplate restTemplate = new RestTemplate();
//            HttpHeaders headers = new HttpHeaders();
//            headers.set("Authorization", request.getHeader("Authorization"));
//            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
//            String result;
//            try {
//                result = restTemplate.postForObject(uri, entity, String.class);
//                log.info("result : {}", result);
//            } catch (RestClientException e) {
//                e.printStackTrace();
//                return null;
//            }
//            user = userRepository.findByEmail(result).orElse(null);
//            if (user.getLoginType().equals(EnumUtils.LOGIN_TYPE.GOOGLE)) {
//                user = verifyGoogleToken(request);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            log.error("Exception while executing getUserNameByHeader() : {}", e.getMessage());
//        }
//        return ;
//    }
//
//    private User verifyGoogleToken(HttpServletRequest request) throws GeneralSecurityException, IOException {
//        String googleToken = request.getHeader("Google-Token");
//        GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(new NetHttpTransport(), new GsonFactory())
//                .setAudience(Collections.singletonList("89729097010-78em1migdpbvh9p82q0419cc5aiae10i.apps.googleusercontent.com"))
//                .build();
//        GoogleIdToken.Payload payload = verifier.verify(googleToken).getPayload();
//        String email = payload.getEmail();
//        return userRepository.findByEmail(email).orElse(null);
//    }
}
