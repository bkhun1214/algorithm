<hr contenteditable="false" data-ke-type="horizontalRule" data-ke-style="style5">
<h3 data-ke-size="size23"><b>목차</b></h3>
<p style="color: #333333; text-align: start;" data-ke-size="size16">- 문자열</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">- 구현</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">- 자료구조</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">- 기초 수학</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">- 누적합</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">- DFS&amp;BFS</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">- 완전탐색</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">- 투포인터</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">- 그리디</p>
<p style="color: #333333; text-align: start;" data-ke-size="size16">- 연습문제</p>
<hr contenteditable="false" data-ke-type="horizontalRule" data-ke-style="style5">
<h3 style="color: #000000; text-align: start;" data-ke-size="size23"><b>문자열</b></h3>
<table style="border-collapse: collapse; width: 100%; height: 323px;" border="1" data-ke-align="alignLeft">
<tbody>
<tr style="height: 23px;">
<td style="width: 10.814%; text-align: center; height: 23px;">번호</td>
<td style="width: 12.6744%; text-align: center; height: 23px;">난이도</td>
<td style="width: 12.5%; text-align: center; height: 23px;">문제번호</td>
<td style="width: 52.1511%; text-align: center; height: 23px;">문제</td>
<td style="width: 11.8605%; text-align: center; height: 23px;">비고</td>
</tr>
<tr>
<td style="width: 10.814%; text-align: center; height: 20px;">1</td>
<td style="width: 12.6744%; text-align: center; height: 20px;"><span style="background-color: #ef6f53; color: #000000;">브론즈4</span></td>
<td style="width: 12.5%; text-align: center; height: 20px;">11720</td>
<td style="width: 52.1511%; text-align: center; height: 20px;"><a href="https://www.acmicpc.net/problem/11720" target="_blank" rel="noopener" style="">숫자의 합</a></td>
<td style="width: 11.8605%; text-align: center; height: 20px;">&nbsp;</td>
</tr>
<tr>
<td style="width: 10.814%; text-align: center; height: 20px;">2</td>
<td style="width: 12.6744%; text-align: center; height: 20px;"><span style="background-color: #ef6f53; color: #333333; text-align: center;"> 브론즈2 </span></td>
<td style="width: 12.5%; text-align: center; height: 20px;">9046</td>
<td style="width: 52.1511%; text-align: center; height: 20px;"><a href="https://www.acmicpc.net/problem/9046" target="_blank" rel="noopener">복호화</a></td>
<td style="width: 11.8605%; text-align: center; height: 20px;">&nbsp;</td>
</tr>
<tr>
<td style="width: 10.814%; text-align: center; height: 20px;">3</td>
<td style="width: 12.6744%; text-align: center; height: 20px;"><span style="background-color: #ef6f53; color: #333333; text-align: center;"> 브론즈1</span></td>
<td style="width: 12.5%; text-align: center; height: 20px;">10798</td>
<td style="width: 52.1511%; text-align: center; height: 20px;"><a href="https://www.acmicpc.net/problem/10798" target="_blank" rel="noopener">세로 읽기</a></td>
<td style="width: 11.8605%; text-align: center; height: 20px;">&nbsp;</td>
</tr>
<tr>
<td style="width: 10.814%; text-align: center; height: 20px;">4</td>
<td style="width: 12.6744%; text-align: center; height: 20px;"><span style="background-color: #ef6f53; color: #333333; text-align: center;">브론즈1</span></td>
<td style="width: 12.5%; text-align: center; height: 20px;">1157</td>
<td style="width: 52.1511%; text-align: center; height: 20px;"><a href="https://www.acmicpc.net/problem/1157" target="_blank" rel="noopener">단어 공부</a></td>
<td style="width: 11.8605%; text-align: center; height: 20px;">&nbsp;</td>
</tr>
<tr>
<td style="width: 10.814%; text-align: center; height: 20px;">5</td>
<td style="width: 12.6744%; text-align: center; height: 20px;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버5</span></td>
<td style="width: 12.5%; text-align: center; height: 20px;">4659</td>
<td style="width: 52.1511%; text-align: center; height: 20px;"><a href="https://www.acmicpc.net/problem/4659" target="_blank" rel="noopener">비밀번호 발음하기</a></td>
<td style="width: 11.8605%; text-align: center; height: 20px;">&nbsp;</td>
</tr>
<tr>
<td style="width: 10.814%; text-align: center; height: 20px;">6</td>
<td style="width: 12.6744%; text-align: center; height: 20px;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버4</span></td>
<td style="width: 12.5%; text-align: center; height: 20px;">1764</td>
<td style="width: 52.1511%; text-align: center; height: 20px;"><a href="https://www.acmicpc.net/problem/1764" target="_blank" rel="noopener">듣보잡</a></td>
<td style="width: 11.8605%; text-align: center; height: 20px;">&nbsp;</td>
</tr>
<tr>
<td style="width: 10.814%; text-align: center; height: 20px;">7</td>
<td style="width: 12.6744%; text-align: center; height: 20px;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;"> 실버3 </span></td>
<td style="width: 12.5%; text-align: center; height: 20px;">20920</td>
<td style="width: 52.1511%; text-align: center; height: 20px;"><a href="https://www.acmicpc.net/problem/20920" target="_blank" rel="noopener">영단어 암기는 괴로워</a></td>
<td style="width: 11.8605%; text-align: center; height: 20px;">&nbsp;</td>
</tr>
<tr>
<td style="width: 10.814%; text-align: center; height: 20px;">8</td>
<td style="width: 12.6744%; text-align: center; height: 20px;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="width: 12.5%; text-align: center; height: 20px;">1515</td>
<td style="width: 52.1511%; text-align: center; height: 20px;"><a href="https://www.acmicpc.net/problem/1515" target="_blank" rel="noopener">수 이어 쓰기</a></td>
<td style="width: 11.8605%; text-align: center; height: 20px;">&nbsp;</td>
</tr>
<tr>
<td style="width: 10.814%; text-align: center; height: 20px;">9</td>
<td style="width: 12.6744%; text-align: center; height: 20px;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="width: 12.5%; text-align: center; height: 20px;">1213</td>
<td style="width: 52.1511%; text-align: center; height: 20px;"><a href="https://www.acmicpc.net/problem/1213" target="_blank" rel="noopener">팰린드롬 만들기</a></td>
<td style="width: 11.8605%; text-align: center; height: 20px;">&nbsp;</td>
</tr>
<tr>
<td style="width: 10.814%; text-align: center; height: 20px;">10</td>
<td style="width: 12.6744%; text-align: center; height: 20px;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="width: 12.5%; text-align: center; height: 20px;">17413</td>
<td style="width: 52.1511%; text-align: center; height: 20px;"><a href="https://www.acmicpc.net/problem/17413" target="_blank" rel="noopener" style="">단어 뒤집기</a></td>
<td style="width: 11.8605%; text-align: center; height: 20px;">&nbsp;</td>
</tr>
<tr>
<td style="width: 10.814%; text-align: center; height: 20px;">11</td>
<td style="width: 12.6744%; text-align: center; height: 20px;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="width: 12.5%; text-align: center; height: 20px;">20291</td>
<td style="width: 52.1511%; text-align: center; height: 20px;"><a href="https://www.acmicpc.net/problem/20291" target="_blank" rel="noopener">파일 정리</a></td>
<td style="width: 11.8605%; text-align: center; height: 20px;">&nbsp;</td>
</tr>
<tr>
<td style="width: 10.814%; text-align: center; height: 20px;">12</td>
<td style="width: 12.6744%; text-align: center; height: 20px;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="width: 12.5%; text-align: center; height: 20px;">1522</td>
<td style="width: 52.1511%; text-align: center; height: 20px;"><a href="https://www.acmicpc.net/problem/1522" target="_blank" rel="noopener">문자열 교환</a></td>
<td style="width: 11.8605%; text-align: center; height: 20px;">&nbsp;</td>
</tr>
<tr>
<td style="width: 10.814%; text-align: center; height: 20px;">13</td>
<td style="width: 12.6744%; text-align: center; height: 20px;"><span style="background-color: #f3c000;">골드5</span></td>
<td style="width: 12.5%; text-align: center; height: 20px;">20437</td>
<td style="width: 52.1511%; text-align: center; height: 20px;"><a href="https://www.acmicpc.net/problem/20437" target="_blank" rel="noopener">문자열 게임</a></td>
<td style="width: 11.8605%; text-align: center; height: 20px;">&nbsp;</td>
</tr>
<tr>
<td style="width: 10.814%; text-align: center; height: 20px;">14</td>
<td style="width: 12.6744%; text-align: center; height: 20px;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드4</span></td>
<td style="width: 12.5%; text-align: center; height: 20px;">2179</td>
<td style="width: 52.1511%; text-align: center; height: 20px;"><a href="https://www.acmicpc.net/problem/2179" target="_blank" rel="noopener">비슷한 단어</a></td>
<td style="width: 11.8605%; text-align: center; height: 20px;">&nbsp;</td>
</tr>
<tr>
<td style="width: 10.814%; text-align: center; height: 20px;">15</td>
<td style="width: 12.6744%; text-align: center; height: 20px;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드4</span></td>
<td style="width: 12.5%; text-align: center; height: 20px;">9935</td>
<td style="width: 52.1511%; text-align: center; height: 20px;"><a href="https://www.acmicpc.net/problem/9935" target="_blank" rel="noopener">문자열 폭</a></td>
<td style="width: 11.8605%; text-align: center; height: 20px;">&nbsp;</td>
</tr>
</tbody>
</table>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23">&nbsp;</h3>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23"><b>구현</b></h3>
<table style="border-collapse: collapse; width: 100%; height: 323px;" border="1" data-ke-align="alignLeft">
<tbody>
<tr>
<td style="text-align: center; width: 10.3489%;">번호</td>
<td style="text-align: center; width: 12.9069%;">난이도</td>
<td style="text-align: center; width: 12.5582%;">문제번호</td>
<td style="text-align: center; width: 52.4418%;">문제</td>
<td style="text-align: center; width: 11.6279%;">비고</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3489%;">1</td>
<td style="text-align: center; width: 12.9069%;"><span style="background-color: #ef6f53; color: #000000;">브론즈1</span></td>
<td style="text-align: center; width: 12.5582%;">14467</td>
<td style="text-align: center; width: 52.4418%;"><a href="https://www.acmicpc.net/problem/14467" target="_blank" rel="noopener">소가 길을 건너간 이유</a></td>
<td style="text-align: center; width: 11.6279%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3489%;">2</td>
<td style="text-align: center; width: 12.9069%;"><span style="background-color: #ef6f53; color: #333333; text-align: center;">브론즈2</span></td>
<td style="text-align: center; width: 12.5582%;">21918</td>
<td style="text-align: center; width: 52.4418%;"><a href="https://www.acmicpc.net/problem/21918" target="_blank" rel="noopener">전구</a></td>
<td style="text-align: center; width: 11.6279%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3489%;">3</td>
<td style="text-align: center; width: 12.9069%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버5</span></td>
<td style="text-align: center; width: 12.5582%;">20546</td>
<td style="text-align: center; width: 52.4418%;"><a href="https://www.acmicpc.net/problem/20546" target="_blank" rel="noopener">기적의 매매법</a></td>
<td style="text-align: center; width: 11.6279%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3489%;">4</td>
<td style="text-align: center; width: 12.9069%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버5</span></td>
<td style="text-align: center; width: 12.5582%;">7568</td>
<td style="text-align: center; width: 52.4418%;"><a href="https://www.acmicpc.net/problem/7568" target="_blank" rel="noopener">덩치</a></td>
<td style="text-align: center; width: 11.6279%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3489%;">5</td>
<td style="text-align: center; width: 12.9069%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버5</span></td>
<td style="text-align: center; width: 12.5582%;">10709</td>
<td style="text-align: center; width: 52.4418%;"><a href="https://www.acmicpc.net/problem/10709" target="_blank" rel="noopener">기상캐스터</a></td>
<td style="text-align: center; width: 11.6279%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3489%;">6</td>
<td style="text-align: center; width: 12.9069%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버4</span></td>
<td style="text-align: center; width: 12.5582%;">9017</td>
<td style="text-align: center; width: 52.4418%;"><a href="https://www.acmicpc.net/problem/9017" target="_blank" rel="noopener">크로스 컨트리</a></td>
<td style="text-align: center; width: 11.6279%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3489%;">7</td>
<td style="text-align: center; width: 12.9069%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="text-align: center; width: 12.5582%;">2852</td>
<td style="text-align: center; width: 52.4418%;"><a href="https://www.acmicpc.net/problem/2852" target="_blank" rel="noopener">NBA 농구</a></td>
<td style="text-align: center; width: 11.6279%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3489%;">8</td>
<td style="text-align: center; width: 12.9069%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="text-align: center; width: 12.5582%;">1913</td>
<td style="text-align: center; width: 52.4418%;"><a href="https://www.acmicpc.net/problem/1913" target="_blank" rel="noopener">달팽이</a></td>
<td style="text-align: center; width: 11.6279%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3489%;">9</td>
<td style="text-align: center; width: 12.9069%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 12.5582%;">20006</td>
<td style="text-align: center; width: 52.4418%;"><a href="https://www.acmicpc.net/problem/20006" target="_blank" rel="noopener">랭킹전 대기열</a></td>
<td style="text-align: center; width: 11.6279%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3489%;">10</td>
<td style="text-align: center; width: 12.9069%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 12.5582%;">1138</td>
<td style="text-align: center; width: 52.4418%;"><a href="https://www.acmicpc.net/problem/1138" target="_blank" rel="noopener">한 줄로 서기</a></td>
<td style="text-align: center; width: 11.6279%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3489%;">11</td>
<td style="text-align: center; width: 12.9069%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 12.5582%;">17276</td>
<td style="text-align: center; width: 52.4418%;"><a href="https://www.acmicpc.net/problem/17276" target="_blank" rel="noopener">배열 돌리기</a></td>
<td style="text-align: center; width: 11.6279%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3489%;">12</td>
<td style="text-align: center; width: 12.9069%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; width: 12.5582%;">16926</td>
<td style="text-align: center; width: 52.4418%;"><a href="https://www.acmicpc.net/problem/16926" target="_blank" rel="noopener">배열 돌리기 1</a></td>
<td style="text-align: center; width: 11.6279%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3489%;">13</td>
<td style="text-align: center; width: 12.9069%;"><span style="background-color: #f3c000;">골드5</span></td>
<td style="text-align: center; width: 12.5582%;">14719</td>
<td style="text-align: center; width: 52.4418%;"><a href="https://www.acmicpc.net/problem/14719" target="_blank" rel="noopener">빗물</a></td>
<td style="text-align: center; width: 11.6279%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3489%;">14</td>
<td style="text-align: center; width: 12.9069%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드5</span></td>
<td style="text-align: center; width: 12.5582%;">20207</td>
<td style="text-align: center; width: 52.4418%;"><a href="https://www.acmicpc.net/problem/20207" target="_blank" rel="noopener">달력</a></td>
<td style="text-align: center; width: 11.6279%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3489%;">15</td>
<td style="text-align: center; width: 12.9069%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드3</span></td>
<td style="text-align: center; width: 12.5582%;">22860</td>
<td style="text-align: center; width: 52.4418%;"><a href="https://www.acmicpc.net/problem/22860" target="_blank" rel="noopener">폴더 정리</a></td>
<td style="text-align: center; width: 11.6279%;">&nbsp;</td>
</tr>
</tbody>
</table>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23">&nbsp;</h3>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23"><b>자료구조</b></h3>
<table style="border-collapse: collapse; width: 100%; height: 323px;" border="1" data-ke-align="alignLeft">
<tbody>
<tr>
<td style="text-align: center; width: 10.1163%;">번호</td>
<td style="text-align: center; width: 12.907%;">난이도</td>
<td style="text-align: center; width: 12.9069%;">문제번호</td>
<td style="text-align: center; width: 53.2559%;">문제</td>
<td style="text-align: center; width: 10.5814%;">비고</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">1</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버4</span></td>
<td style="text-align: center; width: 12.9069%;">10828</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/10828" target="_blank" rel="noopener">스택</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">2</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버4</span></td>
<td style="text-align: center; width: 12.9069%;">10845</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/10845" target="_blank" rel="noopener">큐</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">3</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버4</span></td>
<td style="text-align: center; width: 12.9069%;">1620</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/1620" target="_blank" rel="noopener">나는야 포켓몬 마스터 이다솜</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">4</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버4</span></td>
<td style="text-align: center; width: 12.9069%;">3986</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/3986" target="_blank" rel="noopener">좋은 단어</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">5</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버4</span></td>
<td style="text-align: center; width: 12.9069%;">2164</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/2164" target="_blank" rel="noopener">카드</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">6</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="text-align: center; width: 12.9069%;">9375</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/9375" target="_blank" rel="noopener">패션왕 신해빈</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">7</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="text-align: center; width: 12.9069%;">1874</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/1874" target="_blank" rel="noopener">스택 수열</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">8</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="text-align: center; width: 12.9069%;">14425</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/14425" target="_blank" rel="noopener">문자열 집합</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">9</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="text-align: center; width: 12.9069%;">2910</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/2910" target="_blank" rel="noopener">빈도 정렬</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">10</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 12.9069%;">1927</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/1927" target="_blank" rel="noopener">최소힙</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">11</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 12.9069%;">11279</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/11279" target="_blank" rel="noopener">최대힙</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">12</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 12.9069%;">4358</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/4358" target="_blank" rel="noopener">생태학</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">13</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 12.9069%;">2075</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/2075" target="_blank" rel="noopener">n번째 큰 수</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">14</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 12.9069%;">2304</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/2304" target="_blank" rel="noopener">창고 다각형</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">15</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; width: 12.9069%;">1991</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/1991" target="_blank" rel="noopener">트리순회</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">16</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #f3c000; color: #333333; text-align: center;"> <span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span> </span></td>
<td style="text-align: center; width: 12.9069%;">11286</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/11286" target="_blank" rel="noopener">절대값 힙</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">17</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #f3c000; color: #333333; text-align: center;"> <span style="background-color: #f3c000; color: #333333; text-align: center;">골드5</span> </span></td>
<td style="text-align: center; width: 12.9069%;">2800</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/2800" target="_blank" rel="noopener">괄호제거</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">18</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #f3c000; color: #333333; text-align: center;"> <span style="background-color: #f3c000; color: #333333; text-align: center;">골드5</span> </span></td>
<td style="text-align: center; width: 12.9069%;">3190</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/3190" target="_blank" rel="noopener">뱀</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">19</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #f3c000; color: #333333; text-align: center;"> <span style="background-color: #f3c000; color: #333333; text-align: center;">골드4</span> </span></td>
<td style="text-align: center; width: 12.9069%;">21939</td>
<td style="text-align: center; width: 53.2559%;"><a href="https://www.acmicpc.net/problem/21939" target="_blank" rel="noopener">문제 추천 시스템 Version 1</a></td>
<td style="text-align: center; width: 10.5814%;">&nbsp;</td>
</tr>
</tbody>
</table>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23">&nbsp;</h3>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23"><b>기초 수학</b></h3>
<table style="border-collapse: collapse; width: 100%; height: 320px;" border="1" data-ke-align="alignLeft">
<tbody>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">번호</td>
<td style="text-align: center; height: 20px; width: 13.4884%;">난이도</td>
<td style="text-align: center; height: 20px; width: 12.4419%;">문제번호</td>
<td style="text-align: center; height: 20px; width: 52.7907%;">문제</td>
<td style="text-align: center; height: 20px; width: 10.9302%;">비고</td>
</tr>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">1</td>
<td style="text-align: center; height: 20px; width: 13.4884%;"><span style="background-color: #ef6f53; color: #000000;">브론즈2</span></td>
<td style="text-align: center; height: 20px; width: 12.4419%;">1978</td>
<td style="text-align: center; height: 20px; width: 52.7907%;"><a href="https://www.acmicpc.net/problem/1978" target="_blank" rel="noopener">소수 찾기</a></td>
<td style="text-align: center; height: 20px; width: 10.9302%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">2</td>
<td style="text-align: center; height: 20px; width: 13.4884%;"><span style="background-color: #ef6f53; color: #333333; text-align: center;">브론즈2</span></td>
<td style="text-align: center; height: 20px; width: 12.4419%;">2581</td>
<td style="text-align: center; height: 20px; width: 52.7907%;"><a href="https://www.acmicpc.net/problem/2581" target="_blank" rel="noopener">소수</a></td>
<td style="text-align: center; height: 20px; width: 10.9302%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">3</td>
<td style="text-align: center; height: 20px; width: 13.4884%;"><span style="background-color: #ef6f53; color: #000000; text-align: center;">브론즈2</span></td>
<td style="text-align: center; height: 20px; width: 12.4419%;">5618</td>
<td style="text-align: center; height: 20px; width: 52.7907%;"><a href="https://www.acmicpc.net/problem/5618" target="_blank" rel="noopener">공약수</a></td>
<td style="text-align: center; height: 20px; width: 10.9302%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">4</td>
<td style="text-align: center; height: 20px; width: 13.4884%;"><span style="background-color: #ef6f53; color: #000000; text-align: center;">브론즈2</span></td>
<td style="text-align: center; height: 20px; width: 12.4419%;">2745</td>
<td style="text-align: center; height: 20px; width: 52.7907%;"><a href="https://www.acmicpc.net/problem/2745" target="_blank" rel="noopener">진법 변환</a></td>
<td style="text-align: center; height: 20px; width: 10.9302%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">5</td>
<td style="text-align: center; height: 20px; width: 13.4884%;"><span style="background-color: #ef6f53; color: #000000; text-align: center;">브론즈2</span></td>
<td style="text-align: center; height: 20px; width: 12.4419%;">22864</td>
<td style="text-align: center; height: 20px; width: 52.7907%;"><a href="https://www.acmicpc.net/problem/22864" target="_blank" rel="noopener">피로도</a></td>
<td style="text-align: center; height: 20px; width: 10.9302%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">6</td>
<td style="text-align: center; height: 20px; width: 13.4884%;"><span style="background-color: #ef6f53; color: #000000; text-align: center;">브론즈1</span></td>
<td style="text-align: center; height: 20px; width: 12.4419%;">2609</td>
<td style="text-align: center; height: 20px; width: 52.7907%;"><a href="https://www.acmicpc.net/problem/2609" target="_blank" rel="noopener">최대공약수와 최소공배수</a></td>
<td style="text-align: center; height: 20px; width: 10.9302%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">7</td>
<td style="text-align: center; height: 20px; width: 13.4884%;"><span style="background-color: #ef6f53; color: #000000; text-align: center;">브론즈1</span></td>
<td style="text-align: center; height: 20px; width: 12.4419%;">11653</td>
<td style="text-align: center; height: 20px; width: 52.7907%;"><a href="https://www.acmicpc.net/problem/11653" target="_blank" rel="noopener">소인수분해</a></td>
<td style="text-align: center; height: 20px; width: 10.9302%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">8</td>
<td style="text-align: center; height: 20px; width: 13.4884%;"><span style="background-color: #ef6f53; color: #000000; text-align: center;">브론즈1</span></td>
<td style="text-align: center; height: 20px; width: 12.4419%;">1110</td>
<td style="text-align: center; height: 20px; width: 52.7907%;"><a href="https://www.acmicpc.net/problem/1110" target="_blank" rel="noopener">더하기 사이클</a></td>
<td style="text-align: center; height: 20px; width: 10.9302%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">9</td>
<td style="text-align: center; height: 20px; width: 13.4884%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버5</span></td>
<td style="text-align: center; height: 20px; width: 12.4419%;">5347</td>
<td style="text-align: center; height: 20px; width: 52.7907%;"><a href="https://www.acmicpc.net/problem/5347" target="_blank" rel="noopener">LCM</a></td>
<td style="text-align: center; height: 20px; width: 10.9302%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">10</td>
<td style="text-align: center; height: 20px; width: 13.4884%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버4</span></td>
<td style="text-align: center; height: 20px; width: 12.4419%;">2960</td>
<td style="text-align: center; height: 20px; width: 52.7907%;"><a href="https://www.acmicpc.net/problem/2960" target="_blank" rel="noopener">에라토스테네스의 체</a></td>
<td style="text-align: center; height: 20px; width: 10.9302%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">11</td>
<td style="text-align: center; height: 20px; width: 13.4884%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버4</span></td>
<td style="text-align: center; height: 20px; width: 12.4419%;">9613</td>
<td style="text-align: center; height: 20px; width: 52.7907%;"><a href="https://www.acmicpc.net/problem/9613" target="_blank" rel="noopener">GCD 합</a></td>
<td style="text-align: center; height: 20px; width: 10.9302%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">12</td>
<td style="text-align: center; height: 20px; width: 13.4884%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버4</span></td>
<td style="text-align: center; height: 20px; width: 12.4419%;">21920</td>
<td style="text-align: center; height: 20px; width: 52.7907%;"><a href="https://www.acmicpc.net/problem/21920" target="_blank" rel="noopener">서로소 평균</a></td>
<td style="text-align: center; height: 20px; width: 10.9302%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">13</td>
<td style="text-align: center; height: 20px; width: 13.4884%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="text-align: center; height: 20px; width: 12.4419%;">3474</td>
<td style="text-align: center; height: 20px; width: 52.7907%;"><a href="https://www.acmicpc.net/problem/3474" target="_blank" rel="noopener">교수가 된 현우</a></td>
<td style="text-align: center; height: 20px; width: 10.9302%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">14</td>
<td style="text-align: center; height: 20px; width: 13.4884%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; height: 20px; width: 12.4419%;">21275</td>
<td style="text-align: center; height: 20px; width: 52.7907%;"><a href="https://www.acmicpc.net/problem/21275" target="_blank" rel="noopener">폰 호석만</a></td>
<td style="text-align: center; height: 20px; width: 10.9302%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; height: 20px; width: 10.1163%;">15</td>
<td style="text-align: center; height: 20px; width: 13.4884%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; height: 20px; width: 12.4419%;">1747</td>
<td style="text-align: center; height: 20px; width: 52.7907%;"><a href="https://www.acmicpc.net/problem/1747" target="_blank" rel="noopener">소수&amp;팰린드롬</a></td>
<td style="text-align: center; height: 20px; width: 10.9302%;">&nbsp;</td>
</tr>
</tbody>
</table>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23">&nbsp;</h3>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23"><b>Prefix Sum(누적합)</b></h3>
<table style="border-collapse: collapse; width: 100%; height: 320px;" border="1" data-ke-align="alignLeft">
<tbody>
<tr>
<td style="text-align: center; width: 10.1163%;">번호</td>
<td style="text-align: center; width: 13.4883%;">난이도</td>
<td style="text-align: center; width: 12.0931%;">문제번호</td>
<td style="text-align: center; width: 53.0233%;">문제</td>
<td style="text-align: center; width: 11.2791%;">비고</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">1</td>
<td style="text-align: center; width: 13.4883%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버5</span></td>
<td style="text-align: center; width: 12.0931%;">14929</td>
<td style="text-align: center; width: 53.0233%;"><a href="https://www.acmicpc.net/problem/14929" target="_blank" rel="noopener">귀찮아 (SIB)</a></td>
<td style="text-align: center; width: 11.2791%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">2</td>
<td style="text-align: center; width: 13.4883%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버5</span></td>
<td style="text-align: center; width: 12.0931%;">2167</td>
<td style="text-align: center; width: 53.0233%;"><a href="https://www.acmicpc.net/problem/2167" target="_blank" rel="noopener">2차원 배열의 합</a></td>
<td style="text-align: center; width: 11.2791%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">3</td>
<td style="text-align: center; width: 13.4883%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버5</span></td>
<td style="text-align: center; width: 12.0931%;">11659</td>
<td style="text-align: center; width: 53.0233%;"><a href="https://www.acmicpc.net/problem/11659" target="_blank" rel="noopener">구간 합 구하기 4</a></td>
<td style="text-align: center; width: 11.2791%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">4</td>
<td style="text-align: center; width: 13.4883%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버5</span></td>
<td style="text-align: center; width: 12.0931%;">11660</td>
<td style="text-align: center; width: 53.0233%;"><a href="https://www.acmicpc.net/problem/11660" target="_blank" rel="noopener">구간 합 구하기 5</a></td>
<td style="text-align: center; width: 11.2791%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">5</td>
<td style="text-align: center; width: 13.4883%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버5</span></td>
<td style="text-align: center; width: 12.0931%;">21318</td>
<td style="text-align: center; width: 53.0233%;"><a href="https://www.acmicpc.net/problem/21318" target="_blank" rel="noopener">피아노 체조</a></td>
<td style="text-align: center; width: 11.2791%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">6</td>
<td style="text-align: center; width: 13.4883%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드4</span></td>
<td style="text-align: center; width: 12.0931%;">2015</td>
<td style="text-align: center; width: 53.0233%;"><a href="https://www.acmicpc.net/problem/2015" target="_blank" rel="noopener">수들의 합 4</a></td>
<td style="text-align: center; width: 11.2791%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">7</td>
<td style="text-align: center; width: 13.4883%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드4</span></td>
<td style="text-align: center; width: 12.0931%;">1749</td>
<td style="text-align: center; width: 53.0233%;"><a href="https://www.acmicpc.net/problem/1749" target="_blank" rel="noopener">점수따먹기</a></td>
<td style="text-align: center; width: 11.2791%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">8</td>
<td style="text-align: center; width: 13.4883%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드3</span></td>
<td style="text-align: center; width: 12.0931%;">20440</td>
<td style="text-align: center; width: 53.0233%;"><a href="https://www.acmicpc.net/problem/20440" target="_blank" rel="noopener">니가 싫어 싫어 너무 싫어</a></td>
<td style="text-align: center; width: 11.2791%;">&nbsp;</td>
</tr>
</tbody>
</table>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23">&nbsp;</h3>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23"><b>DFS</b></h3>
<table style="border-collapse: collapse; width: 100%; height: 323px;" border="1" data-ke-align="alignLeft">
<tbody>
<tr>
<td style="text-align: center; width: 10.3488%;">번호</td>
<td style="text-align: center; width: 12.907%;">난이도</td>
<td style="text-align: center; width: 13.1396%;">문제번호</td>
<td style="text-align: center; width: 50.5814%;">문제</td>
<td style="text-align: center; width: 12.907%;">비고</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">1</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 13.1396%;">11724</td>
<td style="text-align: center; width: 50.5814%;"><a href="https://www.acmicpc.net/problem/11724" target="_blank" rel="noopener">연결 요소의 개수</a></td>
<td style="text-align: center; width: 12.907%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">2</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 13.1396%;">10552</td>
<td style="text-align: center; width: 50.5814%;"><a href="https://www.acmicpc.net/problem/10552" target="_blank" rel="noopener">dom</a></td>
<td style="text-align: center; width: 12.907%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">3</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; width: 13.1396%;">11403</td>
<td style="text-align: center; width: 50.5814%;"><a href="https://www.acmicpc.net/problem/11403" target="_blank" rel="noopener">경로찾기</a></td>
<td style="text-align: center; width: 12.907%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">4</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; width: 13.1396%;">2667</td>
<td style="text-align: center; width: 50.5814%;"><a href="https://www.acmicpc.net/problem/2667" target="_blank" rel="noopener">단지번호 붙이기</a></td>
<td style="text-align: center; width: 12.907%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">5</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; width: 13.1396%;">2583</td>
<td style="text-align: center; width: 50.5814%;"><a href="https://www.acmicpc.net/problem/2583" target="_blank" rel="noopener">영역 구하기</a></td>
<td style="text-align: center; width: 12.907%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">6</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; width: 13.1396%;">10026</td>
<td style="text-align: center; width: 50.5814%;"><a href="https://www.acmicpc.net/problem/10026" target="_blank" rel="noopener">적록색약</a></td>
<td style="text-align: center; width: 12.907%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">7</td>
<td style="text-align: center; width: 12.907%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드5</span></td>
<td style="text-align: center; width: 13.1396%;">2668</td>
<td style="text-align: center; width: 50.5814%;"><a href="https://www.acmicpc.net/problem/2668" target="_blank" rel="noopener">숫자고르기</a></td>
<td style="text-align: center; width: 12.907%;">&nbsp;</td>
</tr>
</tbody>
</table>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23">&nbsp;</h3>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23"><b>BFS</b></h3>
<table style="border-collapse: collapse; width: 100%; height: 323px;" border="1" data-ke-align="alignLeft">
<tbody>
<tr>
<td style="text-align: center; width: 10.2326%;">번호</td>
<td style="text-align: center; width: 13.4883%;">난이도</td>
<td style="text-align: center; width: 12.7907%;">문제번호</td>
<td style="text-align: center; width: 49.6512%;">문제</td>
<td style="text-align: center; width: 13.6047%;">비고</td>
</tr>
<tr>
<td style="text-align: center; width: 10.2326%;">1</td>
<td style="text-align: center; width: 13.4883%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 12.7907%;">2644</td>
<td style="text-align: center; width: 49.6512%;"><a href="https://www.acmicpc.net/problem/2644" target="_blank" rel="noopener">촌수계산</a></td>
<td style="text-align: center; width: 13.6047%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.2326%;">2</td>
<td style="text-align: center; width: 13.4883%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 12.7907%;">1012</td>
<td style="text-align: center; width: 49.6512%;"><a href="https://www.acmicpc.net/problem/1012" target="_blank" rel="noopener">유기농배추</a></td>
<td style="text-align: center; width: 13.6047%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.2326%;">3</td>
<td style="text-align: center; width: 13.4883%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; width: 12.7907%;">2178</td>
<td style="text-align: center; width: 49.6512%;"><a href="https://www.acmicpc.net/problem/2178" target="_blank" rel="noopener">미로탐색</a></td>
<td style="text-align: center; width: 13.6047%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.2326%;">4</td>
<td style="text-align: center; width: 13.4883%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; width: 12.7907%;">7562</td>
<td style="text-align: center; width: 49.6512%;"><a href="https://www.acmicpc.net/problem/7562" target="_blank" rel="noopener">나이트의 이동</a></td>
<td style="text-align: center; width: 13.6047%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.2326%;">5</td>
<td style="text-align: center; width: 13.4883%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; width: 12.7907%;">1743</td>
<td style="text-align: center; width: 49.6512%;"><a href="https://www.acmicpc.net/problem/1743" target="_blank" rel="noopener">음식물 피하기</a></td>
<td style="text-align: center; width: 13.6047%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.2326%;">6</td>
<td style="text-align: center; width: 13.4883%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; width: 12.7907%;">7576</td>
<td style="text-align: center; width: 49.6512%;"><a href="https://www.acmicpc.net/problem/7576" target="_blank" rel="noopener">토마토</a></td>
<td style="text-align: center; width: 13.6047%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.2326%;">7</td>
<td style="text-align: center; width: 13.4883%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드5</span></td>
<td style="text-align: center; width: 12.7907%;">3055</td>
<td style="text-align: center; width: 49.6512%;"><a href="https://www.acmicpc.net/problem/3055" target="_blank" rel="noopener">탈출1</a></td>
<td style="text-align: center; width: 13.6047%;">&nbsp;</td>
</tr>
</tbody>
</table>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23">&nbsp;</h3>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23"><b>완전탐색(Brute Force)</b></h3>
<table style="border-collapse: collapse; width: 100%; height: 323px;" border="1" data-ke-align="alignLeft">
<tbody>
<tr>
<td style="text-align: center; width: 10.1163%;">번호</td>
<td style="text-align: center; width: 13.6046%;">난이도</td>
<td style="text-align: center; width: 13.1396%;">문제번호</td>
<td style="text-align: center; width: 50%;">문제</td>
<td style="text-align: center; width: 13.1395%;">비고</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">1</td>
<td style="text-align: center; width: 13.6046%;"><span style="background-color: #ef6f53; color: #000000;">브론즈2</span></td>
<td style="text-align: center; width: 13.1396%;">19532</td>
<td style="text-align: center; width: 50%;"><a href="https://www.acmicpc.net/problem/19532" target="_blank" rel="noopener">수학은 비대면 강의입니다</a></td>
<td style="text-align: center; width: 13.1395%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">2</td>
<td style="text-align: center; width: 13.6046%;"><span style="background-color: #ef6f53; color: #333333; text-align: center;">브론즈2</span></td>
<td style="text-align: center; width: 13.1396%;">22864</td>
<td style="text-align: center; width: 50%;"><a href="https://www.acmicpc.net/problem/22864" target="_blank" rel="noopener">피로도</a></td>
<td style="text-align: center; width: 13.1395%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">3</td>
<td style="text-align: center; width: 13.6046%;"><span style="background-color: #ef6f53; color: #000000; text-align: center;">브론즈1</span></td>
<td style="text-align: center; width: 13.1396%;">2309</td>
<td style="text-align: center; width: 50%;"><a href="https://www.acmicpc.net/problem/2309" target="_blank" rel="noopener">일곱난쟁이</a></td>
<td style="text-align: center; width: 13.1395%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">4</td>
<td style="text-align: center; width: 13.6046%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버5</span></td>
<td style="text-align: center; width: 13.1396%;">15721</td>
<td style="text-align: center; width: 50%;"><a href="https://www.acmicpc.net/problem/15721" target="_blank" rel="noopener">번데기</a></td>
<td style="text-align: center; width: 13.1395%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">5</td>
<td style="text-align: center; width: 13.6046%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버5</span></td>
<td style="text-align: center; width: 13.1396%;">1436</td>
<td style="text-align: center; width: 50%;"><a href="https://www.acmicpc.net/problem/1436" target="_blank" rel="noopener">영화감독 숌</a></td>
<td style="text-align: center; width: 13.1395%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">6</td>
<td style="text-align: center; width: 13.6046%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="text-align: center; width: 13.1396%;">17484</td>
<td style="text-align: center; width: 50%;"><a href="https://www.acmicpc.net/problem/17484" target="_blank" rel="noopener">진우의 달 여행</a></td>
<td style="text-align: center; width: 13.1395%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">7</td>
<td style="text-align: center; width: 13.6046%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="text-align: center; width: 13.1396%;">2503</td>
<td style="text-align: center; width: 50%;"><a href="https://www.acmicpc.net/problem/2503" target="_blank" rel="noopener">숫자 야구</a></td>
<td style="text-align: center; width: 13.1395%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">8</td>
<td style="text-align: center; width: 13.6046%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 13.1396%;">9079</td>
<td style="text-align: center; width: 50%;"><a href="https://www.acmicpc.net/problem/9079" target="_blank" rel="noopener">동전 게임</a></td>
<td style="text-align: center; width: 13.1395%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">9</td>
<td style="text-align: center; width: 13.6046%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 13.1396%;">14620</td>
<td style="text-align: center; width: 50%;"><a href="https://www.acmicpc.net/problem/14620" target="_blank" rel="noopener">꽃길</a></td>
<td style="text-align: center; width: 13.1395%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">10</td>
<td style="text-align: center; width: 13.6046%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; width: 13.1396%;">1992</td>
<td style="text-align: center; width: 50%;"><a href="https://www.acmicpc.net/problem/1992" target="_blank" rel="noopener">쿼드트리</a></td>
<td style="text-align: center; width: 13.1395%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">11</td>
<td style="text-align: center; width: 13.6046%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; width: 13.1396%;">14888</td>
<td style="text-align: center; width: 50%;"><a href="https://www.acmicpc.net/problem/14888" target="_blank" rel="noopener">연산자 끼워넣기</a></td>
<td style="text-align: center; width: 13.1395%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">12</td>
<td style="text-align: center; width: 13.6046%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드5</span></td>
<td style="text-align: center; width: 13.1396%;">12919</td>
<td style="text-align: center; width: 50%;"><a href="https://www.acmicpc.net/problem/12919" target="_blank" rel="noopener">A와 B2</a></td>
<td style="text-align: center; width: 13.1395%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">13</td>
<td style="text-align: center; width: 13.6046%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드4</span></td>
<td style="text-align: center; width: 13.1396%;">1027</td>
<td style="text-align: center; width: 50%;"><a href="https://www.acmicpc.net/problem/1027" target="_blank" rel="noopener">고층건물</a></td>
<td style="text-align: center; width: 13.1395%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.1163%;">14</td>
<td style="text-align: center; width: 13.6046%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드3</span></td>
<td style="text-align: center; width: 13.1396%;">16637</td>
<td style="text-align: center; width: 50%;"><a href="https://www.acmicpc.net/problem/16637" target="_blank" rel="noopener">괄호 추가하기</a></td>
<td style="text-align: center; width: 13.1395%;">&nbsp;</td>
</tr>
</tbody>
</table>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23">&nbsp;</h3>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23"><b>투포인터</b></h3>
<table style="border-collapse: collapse; width: 100%; height: 323px;" border="1" data-ke-align="alignLeft">
<tbody>
<tr>
<td style="text-align: center; width: 10.4651%;">번호</td>
<td style="text-align: center; width: 13.7209%;">난이도</td>
<td style="text-align: center; width: 13.0233%;">문제번호</td>
<td style="text-align: center; width: 52.3256%;">문제</td>
<td style="text-align: center; width: 10.4651%;">비고</td>
</tr>
<tr>
<td style="text-align: center; width: 10.4651%;">1</td>
<td style="text-align: center; width: 13.7209%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버5</span></td>
<td style="text-align: center; width: 13.0233%;">11728</td>
<td style="text-align: center; width: 52.3256%;"><a href="https://www.acmicpc.net/problem/11728" target="_blank" rel="noopener">배열합치기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.4651%;">2</td>
<td style="text-align: center; width: 13.7209%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버4</span></td>
<td style="text-align: center; width: 13.0233%;">1940</td>
<td style="text-align: center; width: 52.3256%;"><a href="https://www.acmicpc.net/problem/1940" target="_blank" rel="noopener">주몽</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.4651%;">3</td>
<td style="text-align: center; width: 13.7209%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="text-align: center; width: 13.0233%;">21921</td>
<td style="text-align: center; width: 52.3256%;"><a href="https://www.acmicpc.net/problem/21921" target="_blank" rel="noopener">블로그</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.4651%;">4</td>
<td style="text-align: center; width: 13.7209%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="text-align: center; width: 13.0233%;">2559</td>
<td style="text-align: center; width: 52.3256%;"><a href="https://www.acmicpc.net/problem/2559" target="_blank" rel="noopener">수열</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.4651%;">5</td>
<td style="text-align: center; width: 13.7209%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; width: 13.0233%;">20922</td>
<td style="text-align: center; width: 52.3256%;"><a href="https://www.acmicpc.net/problem/20922" target="_blank" rel="noopener">겹치는건 싫어</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.4651%;">6</td>
<td style="text-align: center; width: 13.7209%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; width: 13.0233%;">2531</td>
<td style="text-align: center; width: 52.3256%;"><a href="https://www.acmicpc.net/problem/2531" target="_blank" rel="noopener">회전 초밥</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.4651%;">7</td>
<td style="text-align: center; width: 13.7209%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드5</span></td>
<td style="text-align: center; width: 13.0233%;">22862</td>
<td style="text-align: center; width: 52.3256%;"><a href="https://www.acmicpc.net/problem/22862" target="_blank" rel="noopener">가장 긴 짝수 연속한 부분 수열</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.4651%;">8</td>
<td style="text-align: center; width: 13.7209%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드4</span></td>
<td style="text-align: center; width: 13.0233%;">1806</td>
<td style="text-align: center; width: 52.3256%;"><a href="https://www.acmicpc.net/problem/1806" target="_blank" rel="noopener">부분합</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.4651%;">9</td>
<td style="text-align: center; width: 13.7209%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드4</span></td>
<td style="text-align: center; width: 13.0233%;">22945</td>
<td style="text-align: center; width: 52.3256%;"><a href="https://www.acmicpc.net/problem/22945" target="_blank" rel="noopener">팀 빌딩</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.4651%;">10</td>
<td style="text-align: center; width: 13.7209%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드3</span></td>
<td style="text-align: center; width: 13.0233%;">13144</td>
<td style="text-align: center; width: 52.3256%;"><a href="https://www.acmicpc.net/problem/13144" target="_blank" rel="noopener">List of Unique Numbers</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
</tbody>
</table>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23">&nbsp;</h3>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23"><b>그리디</b></h3>
<table style="border-collapse: collapse; width: 100%; height: 323px;" border="1" data-ke-align="alignLeft">
<tbody>
<tr>
<td style="text-align: center; width: 10.3488%;">번호</td>
<td style="text-align: center; width: 14.4186%;">난이도</td>
<td style="text-align: center; width: 12.907%;">문제번호</td>
<td style="text-align: center; width: 51.8605%;">문제</td>
<td style="text-align: center; width: 10.4651%;">비고</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">1</td>
<td style="text-align: center; width: 14.4186%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버5</span></td>
<td style="text-align: center; width: 12.907%;">14916</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/14916" target="_blank" rel="noopener">거스름돈</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">2</td>
<td style="text-align: center; width: 14.4186%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버5</span></td>
<td style="text-align: center; width: 12.907%;">1343</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1343" target="_blank" rel="noopener">폴리오미노</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">3</td>
<td style="text-align: center; width: 14.4186%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버4</span></td>
<td style="text-align: center; width: 12.907%;">11508</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/11508" target="_blank" rel="noopener">2+1 세일</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">4</td>
<td style="text-align: center; width: 14.4186%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버4</span></td>
<td style="text-align: center; width: 12.907%;">11047</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/11047" target="_blank" rel="noopener">동전0</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">5</td>
<td style="text-align: center; width: 14.4186%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="text-align: center; width: 12.907%;">20300</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/20300" target="_blank" rel="noopener">서강근육맨</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">6</td>
<td style="text-align: center; width: 14.4186%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버3</span></td>
<td style="text-align: center; width: 12.907%;">20365</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/20365" target="_blank" rel="noopener">블로그2</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">7</td>
<td style="text-align: center; width: 14.4186%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 12.907%;">1541</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1541" target="_blank" rel="noopener">잃어버린 괄호</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">8</td>
<td style="text-align: center; width: 14.4186%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 12.907%;">16953</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/16953" target="_blank" rel="noopener">A -&gt; B</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">9</td>
<td style="text-align: center; width: 14.4186%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버2</span></td>
<td style="text-align: center; width: 12.907%;">21314</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/21314" target="_blank" rel="noopener">민겸 수</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">10</td>
<td style="text-align: center; width: 14.4186%;"><span style="background-color: #c0d1e7; color: #333333; text-align: center;">실버1</span></td>
<td style="text-align: center; width: 12.907%;">1931</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1931" target="_blank" rel="noopener">회의실 배정</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">11</td>
<td style="text-align: center; width: 14.4186%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드5</span></td>
<td style="text-align: center; width: 12.907%;">19598</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/19598" target="_blank" rel="noopener">최소 회의실 개수</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">12</td>
<td style="text-align: center; width: 14.4186%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드5</span></td>
<td style="text-align: center; width: 12.907%;">2212</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/2212" target="_blank" rel="noopener">센서</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">13</td>
<td style="text-align: center; width: 14.4186%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드5</span></td>
<td style="text-align: center; width: 12.907%;">21758</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/21758" target="_blank" rel="noopener">꿀 따기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">14</td>
<td style="text-align: center; width: 14.4186%;"><span style="background-color: #f3c000; color: #333333; text-align: center;">골드4</span></td>
<td style="text-align: center; width: 12.907%;">13975</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/13975" target="_blank" rel="noopener">파일 합치기 3</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">15</td>
<td style="text-align: center; width: 14.4186%;"><span style="background-color: #f3c000; color: #333333; text-align: center;"> <span style="background-color: #f3c000; color: #333333; text-align: center;">골드3</span></span></td>
<td style="text-align: center; width: 12.907%;">2109</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/2109" target="_blank" rel="noopener">순회 강연</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
</tbody>
</table>


<h3 style="color: #000000; text-align: start;" data-ke-size="size23">&nbsp;</h3>
<h3 style="color: #000000; text-align: start;" data-ke-size="size23"><b>연습문제</b></h3>
<table style="border-collapse: collapse; width: 100%; height: 323px;" border="1" data-ke-align="alignLeft">
<tbody>
<tr>
<td style="text-align: center; width: 10.3488%;">번호</td>
<td style="text-align: center; width: 14.4186%;"><b><del>난이도<del><b></td>
<td style="text-align: center; width: 12.907%;">문제번호</td>
<td style="text-align: center; width: 51.8605%;">문제</td>
<td style="text-align: center; width: 10.4651%;">비고</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">1</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">15591</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/15591" target="_blank" rel="noopener">MooTube (Silver)</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">2</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">10021</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/10021" target="_blank" rel="noopener">Watering the Fields</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">3</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">17780</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/17780" target="_blank" rel="noopener">새로운 게임</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">4</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">18500</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/18500" target="_blank" rel="noopener">미네랄 2</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">5</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">16639</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/16639" target="_blank" rel="noopener">괄호 추가하기 3</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">6</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">1800</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1800" target="_blank" rel="noopener">인터넷 설치	다국어</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">7</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">14466</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/14466" target="_blank" rel="noopener">소가 길을 건너간 이유 6</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">8</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">5852</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/5852" target="_blank" rel="noopener">Island Travels</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">9</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">5827</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/5827" target="_blank" rel="noopener">What's Up With Gravity</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">10</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">17837</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/17837" target="_blank" rel="noopener">새로운 게임 2</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">11</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">9874</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/9874" target="_blank" rel="noopener">Wormholes</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">12</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">5901</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/5901" target="_blank" rel="noopener">Relocation</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">13</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">9881</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/9881" target="_blank" rel="noopener">Ski Course Design</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">14</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">13614</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/13614" target="_blank" rel="noopener">Ecologia</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">15</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">13595</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/13595" target="_blank" rel="noopener">Mania de Par</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">16</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">6063</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/6063" target="_blank" rel="noopener">Rubik's Cube</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">17</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">10037</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/10037" target="_blank" rel="noopener">Decorating the Pastures</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">18</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">10875</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/10875" target="_blank" rel="noopener">뱀</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">19</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">14529</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/14529" target="_blank" rel="noopener">Where's Bessie?</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">20</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">16918</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/16918" target="_blank" rel="noopener">봄버맨</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">21</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">16967</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/16967" target="_blank" rel="noopener">배열 복원하기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">22</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">13604</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/13604" target="_blank" rel="noopener">Jogo de Estratégia</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">23</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">13625</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/13625" target="_blank" rel="noopener">Boss</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">24</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">13627</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/13627" target="_blank" rel="noopener">Dangerous Dive</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">25</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">9879</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/9879" target="_blank" rel="noopener">Cross Country Skiing</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">26</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">9877</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/9877" target="_blank" rel="noopener">Ski Course Rating</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">27</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">17182</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/17182" target="_blank" rel="noopener">우주 탐사선</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">28</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">3109</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/3109" target="_blank" rel="noopener">빵집</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">29</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">18428</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/18428" target="_blank" rel="noopener">감시 피하기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">30</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">2632</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/2632" target="_blank" rel="noopener">피자판매</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">31</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">4256</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/4256" target="_blank" rel="noopener">트리</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">32</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">17199</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/17199" target="_blank" rel="noopener">Milk Factory</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">33</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">2638</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/2638" target="_blank" rel="noopener">치즈</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">34</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">14324</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/14324" target="_blank" rel="noopener">Rain (Small)</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">35</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">15235</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/15235" target="_blank" rel="noopener">Olympiad Pizza</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">36</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">13335</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/13335" target="_blank" rel="noopener">트럭</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">37</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">13787</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/13787" target="_blank" rel="noopener">Infinity Maze</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">38</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">11967</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/11967" target="_blank" rel="noopener">불켜기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">39</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">8972</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/8972" target="_blank" rel="noopener">미친 아두이노</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">40</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">1391</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1391" target="_blank" rel="noopener">종이접기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">41</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">1918</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1918" target="_blank" rel="noopener">후위 표기식</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">42</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">1935</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1935" target="_blank" rel="noopener">후위 표기식2</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">43</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">1113</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1113" target="_blank" rel="noopener">수영장 만들기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">44</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">1109</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1109" target="_blank" rel="noopener">섬</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">45</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">12000</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/12000" target="_blank" rel="noopener">Circular Barn (Bronze)</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">46</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">16767</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/16767" target="_blank" rel="noopener">Convention II</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">47</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">1976</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1976" target="_blank" rel="noopener">여행 가자</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">48</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">17025</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/17025" target="_blank" rel="noopener">Icy Perimeter</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">49</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">5558</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/5558" target="_blank" rel="noopener">チーズ (Cheese)</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">50</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">2164</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/2164" target="_blank" rel="noopener">카드2</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">51</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">1244</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1244" target="_blank" rel="noopener">스위치 켜고 끄기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">52</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">1765</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1765" target="_blank" rel="noopener">닭싸움 팀 정하기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">53</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">2234</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/2234" target="_blank" rel="noopener">성곽</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">54</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">2174</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/2174" target="_blank" rel="noopener">로봇 시뮬레이션</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">55</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">2983</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/2983" target="_blank" rel="noopener">개구리 공주</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">56</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">5830</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/5830" target="_blank" rel="noopener">Bovine Ballet</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">57</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">11964</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/11964" target="_blank" rel="noopener">Fruit Feast</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">58</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">11965</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/11965" target="_blank" rel="noopener">Bessie's Dream</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">59</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">15113</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/15113" target="_blank" rel="noopener">Grid Coloring</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">60</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">15059</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/15059" target="_blank" rel="noopener">Hard choice</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">61</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">6087</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/6087" target="_blank" rel="noopener">레이저 통신</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">62</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">1189</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1189" target="_blank" rel="noopener">컴백홈</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">63</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">10653</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/10653" target="_blank" rel="noopener">마라톤 2</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">64</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">11996</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/11996" target="_blank" rel="noopener">Circular Barn (Silver)</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">65</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">12467</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/12467" target="_blank" rel="noopener">Rains Over Atlantis (Small)</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">66</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">1135</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1135" target="_blank" rel="noopener">뉴스 전하기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">67</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">18427</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/18427" target="_blank" rel="noopener">함께 블록 쌓기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">68</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">18429</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/18429" target="_blank" rel="noopener">근손실</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">69</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">18430</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/18430" target="_blank" rel="noopener">무기 공학</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">70</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">18809</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/18809" target="_blank" rel="noopener">Gaaaaaaaaaarden</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">71</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">18808</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/18808" target="_blank" rel="noopener">스티커 붙이기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">72</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">10655</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/10655" target="_blank" rel="noopener">마라톤 1</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">73</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">11975</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/11975" target="_blank" rel="noopener">Build Gates</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">74</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">11997</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/11997" target="_blank" rel="noopener">Load Balancing (Silver)</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">75</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">10674</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/10674" target="_blank" rel="noopener">Meeting Time</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">76</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">10530</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/10530" target="_blank" rel="noopener">Flowery Trails</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">77</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">3482</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/3482" target="_blank" rel="noopener">Labyrinth</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">78</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">8061</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/8061" target="_blank" rel="noopener">Bitmap</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">79</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">10259</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/10259" target="_blank" rel="noopener">Amanda Lounges</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">80</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">4347</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/4347" target="_blank" rel="noopener">Tic Tac Toe</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">81</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">2138</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/2138" target="_blank" rel="noopener">전구와 스위치</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">82</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">10836</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/10836" target="_blank" rel="noopener">여왕벌	서브태스크</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">83</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">1043</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1043" target="_blank" rel="noopener">거짓말</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">84</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">10800</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/10800" target="_blank" rel="noopener">컬러볼</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">85</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">8980</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/8980" target="_blank" rel="noopener">택배	서브태스크</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">86</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">1725</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1725" target="_blank" rel="noopener">히스토그램</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">87</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">17086</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/17086" target="_blank" rel="noopener">아기 상어 2</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">88</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">10159</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/10159" target="_blank" rel="noopener">저울</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">89</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">1917</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/1917" target="_blank" rel="noopener">정육면체 전개도</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">90</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">3025</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/3025" target="_blank" rel="noopener">돌 던지기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">91</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">17788</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/17788" target="_blank" rel="noopener">Gluttonous Goop</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">92</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">18606</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/18606" target="_blank" rel="noopener">Block Breaker</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">93</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">2310</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/2310" target="_blank" rel="noopener">어드벤처 게임</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">94</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">6178</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/6178" target="_blank" rel="noopener">Lake Making</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">95</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">6373</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/6373" target="_blank" rel="noopener">Round and Round We Go</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">96</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">13460</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/13460" target="_blank" rel="noopener">구슬 탈출 2</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">97</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">12100</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/12100" target="_blank" rel="noopener">2048 (Easy)</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">98</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">3190</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/3190" target="_blank" rel="noopener">뱀</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">99</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">13458</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/13458" target="_blank" rel="noopener">시험 감독</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">100</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">14499</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/14499" target="_blank" rel="noopener">주사위 굴리기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">101</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">14500</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/14500" target="_blank" rel="noopener">테트로미노</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">102</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">14501</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/14501" target="_blank" rel="noopener">퇴사</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">103</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">14502</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/14502" target="_blank" rel="noopener">연구소</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">104</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">14503</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/14503" target="_blank" rel="noopener">로봇 청소기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">105</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">14888</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/14888" target="_blank" rel="noopener">연산자 끼워넣기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">106</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">14889</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/14889" target="_blank" rel="noopener">스타트와 링크</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">107</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">14890</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/14890" target="_blank" rel="noopener">경사로</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">108</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">14891</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/14891" target="_blank" rel="noopener">톱니바퀴</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">109</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">15683</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/15683" target="_blank" rel="noopener">감시</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">110</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">15684</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/15684" target="_blank" rel="noopener">사다리 조작</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">111</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">15685</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/15685" target="_blank" rel="noopener">드래곤 커브</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">112</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">15686</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/15686" target="_blank" rel="noopener">치킨 배달</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">113</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">5373</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/5373" target="_blank" rel="noopener">큐빙</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">114</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">16234</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/16234" target="_blank" rel="noopener">인구 이동</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">115</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">16235</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/16235" target="_blank" rel="noopener">나무 재테크</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">116</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">16236</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/16236" target="_blank" rel="noopener">아기 상어</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">117</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">17144</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/17144" target="_blank" rel="noopener">미세먼지 안녕!</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">118</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">17143</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/17143" target="_blank" rel="noopener">낚시왕</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">119</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">17140</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/17140" target="_blank" rel="noopener">이차원 배열과 연산</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">120</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">17142</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/17142" target="_blank" rel="noopener">연구소 3</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">121</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">17779</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/17779" target="_blank" rel="noopener">게리맨더링 2</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">123</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">17822</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/17822" target="_blank" rel="noopener">원판 돌리기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">124</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">17825</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/17825" target="_blank" rel="noopener">주사위 윷놀이</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">125</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">20061</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/20061" target="_blank" rel="noopener">모노미노도미노 2</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">126</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">19236</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/19236" target="_blank" rel="noopener">청소년 상어</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">127</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">19237</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/19237" target="_blank" rel="noopener">어른 상어</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">128</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">19238</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/19238" target="_blank" rel="noopener">스타트 택시</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">129</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">20055</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/20055" target="_blank" rel="noopener">컨베이어 벨트 위의 로봇</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">130</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">20056</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/20056" target="_blank" rel="noopener">마법사 상어와 파이어볼</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">131</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">20057</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/20057" target="_blank" rel="noopener">마법사 상어와 토네이도</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">132</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">20058</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/20058" target="_blank" rel="noopener">마법사 상어와 파이어스톰</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">133</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">21608</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/21608" target="_blank" rel="noopener">상어 초등학교</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">134</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">21609</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/21609" target="_blank" rel="noopener">상어 중학교</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">135</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">21610</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/21610" target="_blank" rel="noopener">마법사 상어와 비바라기</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">136</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">21611</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/21611" target="_blank" rel="noopener">마법사 상어와 블리자드</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">137</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">23288</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/23288" target="_blank" rel="noopener">주사위 굴리기 2</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">138</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">23289</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/23289" target="_blank" rel="noopener">온풍기 안녕!</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">139</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">23290</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/23290" target="_blank" rel="noopener">마법사 상어와 복제</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
<tr>
<td style="text-align: center; width: 10.3488%;">140</td>
<td style="text-align: center; width: 14.4186%;"></td>
<td style="text-align: center; width: 12.907%;">23291</td>
<td style="text-align: center; width: 51.8605%;"><a href="https://www.acmicpc.net/problem/23291" target="_blank" rel="noopener">어항 정리</a></td>
<td style="text-align: center; width: 10.4651%;">&nbsp;</td>
</tr>
</tbody>
</table>