//자동차공장
//
//생산할 자동차를 선택해주세요
//1. 붕붕, 2. 승용차, 3. 버스, 4. 트럭, 0. 생산종료
//
//입력이 완료되면 다음과 같이 출력한다.
//총 생산 자동차 수 : 000대
//붕붕 : 00대
//승용차 : 00대
//버스 : 00대
//트럭 : 00대
//
//종류 : 붕붕
//최대속도 : 300km/h
//연료 : 꽃향기
//탑승인원수 : 1명
//
//종류 : 승용차
//최대속도 : 200km/h
//연로 : 휘발유
//탑승인원수 : 4명
//
//종류 : 버스
//최대속도 : 150km/h
//연료 : 가스
//탑승인원수 : 50명
//
//종류 : 트럭
//최대속도 : 100km/h
//연료 : 가스
//탑승인원수 : 3명
//
//생산된 자동차들의 평균 속도 : 000km/h
//생산된 자동차들의 총 탑승인원수 : 0000명
//연료가 꽃향기인 자동차의 수 : 00대
//연료가 휘발유인 자동차의 수 : 00대
//연료가 가스인 자동차의 수 : 00대

fun main(){
    val carFactory = CarFactory()
    carFactory.runCarFactory()
}