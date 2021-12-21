# __java.nio__


-----
## file
- Path
  - 경로를 나타내는 객체
- Paths
  - get 메서드로 Path 구현객체 생성
  - 절대경로 상대경로 모두 가능
- Files
  - 파일을 다루는데 필요한 정적 메서드 제공
  - path를 매개변수로 받아서 파일 속성 읽어오는 정적메서드 제공
  - 디렉토리와 파일 생성, 조회
- FileSystem
  - 현재 os의 파일시스템에 접근
- FileSystems
- FileStore
  - 파일저장소를 나타냄
- WatchService
  - 디렉토리 내부의 파일생성, 삭제, 수정 등의 변화 감지
  - path.register() 메서드로 등록
  - 변화가 발생하면 WatchEvent 발생
- WatchKey
  - WatchEvent 발생하면 생성
  - WatchService 인스턴스의 take()메서드의 반환타입
- WatchEvent
  - 특정 path에서 발생한 생성,수정,삭제 등의 이벤트



## Buffer
 - Buffer
   - 버퍼를 나타내는 추상클래스, NIO에서는 데이터 입출력에 항상 버퍼 사용
   - 버퍼는 읽고쓰기가 가능한 메모리 배열
   - Direct(OS가 관리), Non-Direct 2종류의 버퍼 생성가능
 - ByteBuffer
 - CharBuffer
 - ShortBuffer
 - IntBuffer
 - LongBuffer
 - FloatBuffer
 - DoubleBuffer
 - MappedByteBuffer
