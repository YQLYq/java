/*
 * @Description: 
 * @Version: 2.0
 * @Autor: ������
 * @Date: 2022-04-24 20:12:02
 * @LastEditors: ������
 * @LastEditTime: 2022-04-24 21:02:20
 */
package suanfaHomeWork;

import java.util.Arrays;

public class seven_2 {
      public static void main(String[] args){
   
        seven_2 test = new seven_2();
          char[][] xxxooo = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
          test.solve(xxxooo);
          System.out.print(Arrays.deepToString(xxxooo));
      }
   
      public void solve(char[][] board) {
          if(board == null || board.length == 0){
              return;
          }
          // ��
          int m = board.length;
          // ��
          int n = board[0].length;
          for (int i = 0; i < m; i++) {
              for (int j = 0; j < n; j++) {
                  // �ӱ�Եo��ʼ����
                  // �ж��Ƿ�ͱ߽���ͨ
                  // boolean����ֻҪ���������ĸ�����֮һ��˵����ʱ�ڱ߽���
                  boolean isEdge = i == 0 || j == 0 || i == m - 1 || j == n - 1;
                  if (isEdge && board[i][j] == 'O') {
                      dfs(board, i, j);
                  }
              }
          }
          // �Ѳ���'#����'O'�ĳ�'X'
          for (int i = 0; i < m; i++) {
              for (int j = 0; j < n; j++) {
                  if (board[i][j] == 'O') {
                      board[i][j] = 'X';
                  }
                  if (board[i][j] == '#') {
                      board[i][j] = 'O';
                  }
              }
          }
   
      }
      // dfs�Һͱ߽���ͨ��'O'�����'#'������ܱ�'X'�滻��������һ�ξͲ��ᱻ����
      public static void dfs(char[][] board,int i,int j) {
          if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == 'X' || board[i][j] == '#') {
              // board[i][j] == '#' ˵���Ѿ���������.
              return;
          }
          board[i][j] = '#';
          // ��
          dfs(board, i - 1, j);
          // ��
          dfs(board, i + 1, j);
          // ��
          dfs(board, i, j - 1);
          // ��
          dfs(board, i, j + 1);
      }
  }
