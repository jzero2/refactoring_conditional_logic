
# 설정
    mac 시스템설정 > 키보드 > 키보드단축키 > 서비스 > 텍스트 > 터미널에서 man 페이지 인덱스 검색 해제

# 리팩토링 기능 실행 방법
    1. Ctrl + T
    2. Cmd + Shift + A > 액션명 
    3. Shift Double > 액션명
    4. 메뉴에서 선택

# 실행
    ShippingCostCalculatorTest

# 진행과정
    1. Introduce Parameter > order.getWeight()
        order 와의 결합을 제거
    2. Replace Method With Method Object > ShippingCostCalculator
        Extract Delegate > 클래스가 상태를 갖지않게 메서드에 파라메터로 넘김
    3. Move Inner Class to Upper Level
    4. 공통로직으로 만들기.
        getRate() , getAdjustment() 
    5. Replace constructor with factory method
        어떤 상태(weight) 에 대한 조건문이 너무 여러 군데 존재. > 상속관계로 풀 수 있음.
    6. 조건 별 구현체 생성
        static 생성자의 return 문을 지우고 if 문 전체 복사 하여 각 클래스 생성
    7. Push Members Down
    8. Test with Coverage & delete
    9. Remove Redundant else
    10. Rename invoke to calculate

# Refactoring 결과
    git checkout refactoring_conditional_logic     


