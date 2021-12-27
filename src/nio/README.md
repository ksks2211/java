# __java.nio__
    NIO APIs 에 필요한 클래스, 인터페이스 정의

-----

## nio.file

- Path
    - 경로를 나타냄
- Paths
    - get 메서드로 Path 구현객체 생성
    - 절대경로 상대경로 모두 처리 가능
- Files
    - 파일과 디렉터리를 다루는데 필요한 정적 메서드 제공
- FileSystem
    - 현재 os의 파일시스템에 접근
- FileSystems
- FileStore
    - 파일저장소를 나타냄
- WatchService
    - 디렉토리 내부의 파일생성, 삭제, 수정 등의 변화 감지
    - path.register() 메서드로 등록, 변화가 발생하면 WatchEvent 발생
- WatchKey
    - WatchEvent 발생하면 생성, WatchService 인스턴스의 take()메서드의 반환타입
- WatchEvent
    - 특정 path에서 발생한 생성,수정,삭제 등의 이벤트

## Buffer & ByteOrder

- Buffer
    - 버퍼를 나타내는 추상클래스, NIO에서는 데이터 입출력에 항상 버퍼 사용
    - Direct(OS가 관리), Non-Direct 2종류의 버퍼 생성가능
    - 위치속성(position, limit, capacity, mark)을 가진다.
- ByteBuffer
- CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer, DoubleBuffer
- MappedByteBuffer
- ByteOrder
    - 바이트 처리방식, Little Endian vs Big Endian

## nio.channels

- Channel
    - represents an open connection to an entity such as a hardware device, a file, a network socket, or a program
      component
- Channels
    - Utility methods for channels and streams
- FileChannel
    - reading, writing, mapping, and manipulating a file
- AsynchronousFileChannel
  - 비동기 방식으로 동작, 스레드풀에 작업요청하고 즉시 void 리턴
  - 작업완료시 생성시 등록된 CompletionHandler completed or failed 메서드 호출

## nio.charset

- Charset
    - 문자열 인코딩, 디코딩 지원