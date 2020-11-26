/*
// 20174246컴퓨터공학과 강진호입니다. 저번학기에 배워 가장 자신있는 C++로 코딩을 해보았습니다. 감사합니다!!!

#define _CRT_SECURE_NO_WARNINGS // strcpy의 오류를 잡아줌

#include <iostream> // 표준입출력 인클루드
#include <string>
#include <cstring> // strcpy 복사함수를 사용하기 위한 인클루드;;
using namespace std;

void B8ZSIncoder(char* a) // B8ZS의 인코더
{
	int i, j, count = 0;
	int length = strlen(a); // a의 길이를 length변수에 저장
	for (i = 0; i < length; i++) { // a의 길이만큼 for문을 반복
		if (a[i] == '1') {
			count++;
			if (count % 2 == 1) a[i] = '+'; // 1이 나올때마다 count를 올려 그수가 홀수이면 + 짝수이면 -로 변환
			else a[i] = '-';
		}
	}
	count = 0; // 위에서 count를 사용하였으므로 count값 초기화
	for (i = 0; i < length; i++) {
		if (a[i] == '0') {
			for (j = i; j < i + 8; j++) {
				if (a[j] == '0') count++; // 0을 발견하면 count를 올린다
				else
				{
					count = 0; // 0이 8개가 아니면 count초기화 후 빠져나간다.
					break;
				}
			}
			if (count == 8) { // 0이총 8개가 연속으로 반복되어있다면
				if (a[i - 1] == '+') // 바로앞이+일때
				{
					a[i + 3] = a[i+7] = '+',	a[i + 4] = a[i + 6] = '-'; // 000+-0-+로 변환
					break;
				}
				else if (a[i - 1] == '-') // 바로앞이 -일때
				{
					a[i + 3] = a[i + 7] = '-', a[i + 4] = a[i + 6] = '+'; // 000-+0+-로 변환
					break;
				}
			}
		}
	}
	cout << a << endl; // 출력
}

void B8ZSDecoder(char* a) {
	int i, j;
	int length = strlen(a); // a의 길이를 length변수에 저장
	for (i = 0; i < length; i++) {
		if (a[i] == '0' && a[i + 1] == '0' && a[i + 2] == '0' && a[i+3] == '+'&& a[i+4] == '-' && a[i + 5] == '0' && a[i+6] == '-' && a[i+7] == '+') { //000+-0-+의 경우
				for (j = i; j < i + 8; j++) {
					a[j] = '0'; // 전부 0으로 변환
				}
		}
		if (a[i] == '0' && a[i + 1] == '0' && a[i + 2] == '0' && a[i + 3] == '-' && a[i + 4] == '+' && a[i + 5] == '0' && a[i + 6] == '+' && a[i + 7] == '-') { // 000-+0+-의 경우
			for (j = i; j < i + 8; j++) {
				a[j] = '0'; //전부 0으로 변환
			}
		}
	}
	for (i = 0; i < length; i++) {
		if (a[i] == '+' || a[i] == '-') a[i] = '1'; // +와 -를전부 1로변환
	}
	cout << a << endl;
}

int main() {
	char *a = new char;
	char* b = new char;
	int count = 0;

	while(1) {

		cout << "인코더를 사용할 경우 D 디코더를 사용할경우 S를 앞에 붙이고 신호를 입력해주세요.." << endl;
		cin >> a;
		strcpy(b, a); // b에 a를 복사
		if (a[0] == 'D') {
			b[0] = 'S';
			B8ZSIncoder(b);
		}
		else if (a[0] == 'S') {
			b[0] = 'D';
			B8ZSDecoder(b);
		}
	}
	delete a, b; // 동적 할당받은 a,b 반환
}
*/