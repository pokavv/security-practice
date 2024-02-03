# 인증 / 인가 기능 학습 (token)

### 개발환경
- Springboot 3.2.2
- Spring Security 6.2.1
- JWT
- OAuth2
- thymeleaf

### 목표
- Security / JWT / OAuth2 학습
- 카카오 / 네이버 소셜로그인 도전

### 기록
#### 20240203
**1. requestMatchers(...).permitAll() : 403 error**
- spring boot 에서 에러가 발생할 시, /error 로 매핑 -> security filter 에서 /error 가 걸려서 403 발생
- 해결 : requestMatchers(...).permitAll() 에 "/error" 추가

**2. spring boot 3.x, spring security 6.2.1**
- deprecated 된게 많음 -> is deprecated and marked for removal 오류 발생
