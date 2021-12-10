# __java.net__

## Address
- InetAddress
  - IP주소를 나타내는 클래스
  - Domain 이름으로부터 IP주소 가져오는 기능
  - 로컬 컴퓨터의 IP주소 객체 생성하는 기능
- InetSocketAddress
  - IP주소와 포트번호를 나타내는 클래스


## URL
- URL
  - protocol, hostname, port, path, query, anchor 의 정보를 가진 URL을 나타내는 클래스
  
## TCP
- ServerSocket
  - 서버에만 존재, 클라이언트의 연결요청을 처리하는 역할
  - 특정 포트에 바인딩 되어 연결 요청을 대기
- Socket
  - 프로세스간 통신에 사용되는 endpoint
  - 여러개의 socket이 하나의 포트를 공유해서 사용할수 있음
  - 1대1 통신

## UDP
- DatagramSocket
  - 비연결 지향 소켓
- DatagramPacket
  - 헤더와 데이터로 구성
 