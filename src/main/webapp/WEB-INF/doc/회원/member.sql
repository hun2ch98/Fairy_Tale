DROP TABLE member;

CREATE TABLE member(
    memberno        NUMBER(10)        NOT NULL,           -- 회원 번호
    name            VARCHAR(30)       NOT NULL,
    id              VARCHAR(50)       NOT NULL    UNIQUE, -- 아이디, 중복 X
    password        VARCHAR(255)      NOT NULL,           -- 패스워드, 영숫자 조합, 암호화
    email           VARCHAR(50)       NOT NULL    UNIQUE, -- 이메일
    birth           VARCHAR(20)       NOT NULL,           -- 생년월일
    phone           VARCHAR(30)       NULL,           
    address         VARCHAR(80)       NULL,
    nickname        VARCHAR(30)       NULL,           -- 별명
    rdate           DATE              NOT NULL,
    pf_img          VARCHAR(100)      NULL,           
    pf_saved        VARCHAR(100)      NULL,        
    pf_size         NUMBER(10)        DEFAULT 0 NULL
);

COMMENT ON TABLE MEMBER is '회원';
COMMENT ON COLUMN MEMBER.MEMBERNO is '회원 번호';
COMMENT ON COLUMN MEMBER.GRADENO is '등급 번호';
COMMENT ON COLUMN MEMBER.ID is '아이디';
COMMENT ON COLUMN MEMBER.PASSWD is '패스워드';
COMMENT ON COLUMN MEMBER.EMAIL is '이메일';
COMMENT ON COLUMN MEMBER.NAME is '성명';
COMMENT ON COLUMN MEMBER.NICKNAME is '닉네임';
COMMENT ON COLUMN MEMBER.BIRTH is '생년월일';
COMMENT ON COLUMN MEMBER.PHONE is '전화번호';
COMMENT ON COLUMN MEMBER.ZIPCODE is '우편번호';
COMMENT ON COLUMN MEMBER.ADDRESS1 is '주소1';
COMMENT ON COLUMN MEMBER.ADDRESS2 is '주소2';
COMMENT ON COLUMN MEMBER.PF_IMG is '프로필 이미지';
COMMENT ON COLUMN MEMBER.FILE1SAVED is '실제 저장된 프로필 이미지';
COMMENT ON COLUMN MEMBER.THUMB1 is '프로필 이미지 Preview';
COMMENT ON COLUMN MEMBER.RECOVERY_KEY is '복구키';
COMMENT ON COLUMN MEMBER.SIZE1 is '프로필 이미지 크기';
COMMENT ON COLUMN MEMBER.MDATE is '가입일';
COMMENT ON COLUMN MEMBER.GRADE is '등급';

DROP SEQUENCE member_seq;

CREATE SEQUENCE member_seq
  START WITH 1              -- 시작 번호
  INCREMENT BY 1          -- 증가값
  MAXVALUE 9999999999 -- 최대값: 9999999 --> NUMBER(7) 대응
  CACHE 2                       -- 2번은 메모리에서만 계산
  NOCYCLE;                     -- 다시 1부터 생성되는 것을 방지
