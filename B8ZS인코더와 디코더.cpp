/*
// 20174246��ǻ�Ͱ��а� ����ȣ�Դϴ�. �����б⿡ ��� ���� �ڽ��ִ� C++�� �ڵ��� �غ��ҽ��ϴ�. �����մϴ�!!!

#define _CRT_SECURE_NO_WARNINGS // strcpy�� ������ �����

#include <iostream> // ǥ������� ��Ŭ���
#include <string>
#include <cstring> // strcpy �����Լ��� ����ϱ� ���� ��Ŭ���;;
using namespace std;

void B8ZSIncoder(char* a) // B8ZS�� ���ڴ�
{
	int i, j, count = 0;
	int length = strlen(a); // a�� ���̸� length������ ����
	for (i = 0; i < length; i++) { // a�� ���̸�ŭ for���� �ݺ�
		if (a[i] == '1') {
			count++;
			if (count % 2 == 1) a[i] = '+'; // 1�� ���ö����� count�� �÷� �׼��� Ȧ���̸� + ¦���̸� -�� ��ȯ
			else a[i] = '-';
		}
	}
	count = 0; // ������ count�� ����Ͽ����Ƿ� count�� �ʱ�ȭ
	for (i = 0; i < length; i++) {
		if (a[i] == '0') {
			for (j = i; j < i + 8; j++) {
				if (a[j] == '0') count++; // 0�� �߰��ϸ� count�� �ø���
				else
				{
					count = 0; // 0�� 8���� �ƴϸ� count�ʱ�ȭ �� ����������.
					break;
				}
			}
			if (count == 8) { // 0���� 8���� �������� �ݺ��Ǿ��ִٸ�
				if (a[i - 1] == '+') // �ٷξ���+�϶�
				{
					a[i + 3] = a[i+7] = '+',	a[i + 4] = a[i + 6] = '-'; // 000+-0-+�� ��ȯ
					break;
				}
				else if (a[i - 1] == '-') // �ٷξ��� -�϶�
				{
					a[i + 3] = a[i + 7] = '-', a[i + 4] = a[i + 6] = '+'; // 000-+0+-�� ��ȯ
					break;
				}
			}
		}
	}
	cout << a << endl; // ���
}

void B8ZSDecoder(char* a) {
	int i, j;
	int length = strlen(a); // a�� ���̸� length������ ����
	for (i = 0; i < length; i++) {
		if (a[i] == '0' && a[i + 1] == '0' && a[i + 2] == '0' && a[i+3] == '+'&& a[i+4] == '-' && a[i + 5] == '0' && a[i+6] == '-' && a[i+7] == '+') { //000+-0-+�� ���
				for (j = i; j < i + 8; j++) {
					a[j] = '0'; // ���� 0���� ��ȯ
				}
		}
		if (a[i] == '0' && a[i + 1] == '0' && a[i + 2] == '0' && a[i + 3] == '-' && a[i + 4] == '+' && a[i + 5] == '0' && a[i + 6] == '+' && a[i + 7] == '-') { // 000-+0+-�� ���
			for (j = i; j < i + 8; j++) {
				a[j] = '0'; //���� 0���� ��ȯ
			}
		}
	}
	for (i = 0; i < length; i++) {
		if (a[i] == '+' || a[i] == '-') a[i] = '1'; // +�� -������ 1�κ�ȯ
	}
	cout << a << endl;
}

int main() {
	char *a = new char;
	char* b = new char;
	int count = 0;

	while(1) {

		cout << "���ڴ��� ����� ��� D ���ڴ��� ����Ұ�� S�� �տ� ���̰� ��ȣ�� �Է����ּ���.." << endl;
		cin >> a;
		strcpy(b, a); // b�� a�� ����
		if (a[0] == 'D') {
			b[0] = 'S';
			B8ZSIncoder(b);
		}
		else if (a[0] == 'S') {
			b[0] = 'D';
			B8ZSDecoder(b);
		}
	}
	delete a, b; // ���� �Ҵ���� a,b ��ȯ
}
*/