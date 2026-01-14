class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = opSkip(pos, op_start, op_end);

        for (String command : commands) {
            if ("prev".equals(command)) {
                answer = prevCommnad(answer);
                answer = opSkip(answer, op_start, op_end);
            } else if ("next".equals(command)) {
                answer = nextCommand(answer, video_len);
                answer = opSkip(answer, op_start, op_end);
            }
        }
        
        return answer;
    }

    private String opSkip(String pos, String op_start, String op_end) {
        int[] posSplit = lengthSplit(pos);
        int[] opStartSplit = lengthSplit(op_start);
        int[] opEndSplit = lengthSplit(op_end);

        if (opStartSplit[0] == opEndSplit[0] && opStartSplit[0] == posSplit[0]) {
            if (posSplit[1] >= opStartSplit[1] && posSplit[1] <= opEndSplit[1]) {
                return op_end;
            }
        } else if (posSplit[0] > opStartSplit[0] && posSplit[0] < opEndSplit[0]) {
            return op_end;
        } else if (posSplit[0] == opStartSplit[0] && posSplit[1] >= opStartSplit[1]) {
            return op_end;
        } else if (posSplit[0] == opEndSplit[0] && posSplit[1] <= opEndSplit[1]) {
            return op_end;
        }

        return pos;
    }

    private String prevCommnad(String pos) {
        int[] posSplit = lengthSplit(pos);
        posSplit[1] = posSplit[1] - 10;

        if (posSplit[1] < 0) {
            posSplit[1] = posSplit[1] + 60;
            posSplit[0] = posSplit[0] - 1;
        }

        if (posSplit[0] < 0) {
            posSplit[0] = 0;
            posSplit[1] = 0;
        }

        return String.format("%s%s%s", convertToString(posSplit[0]), ":", convertToString(posSplit[1]));
    }

    private String nextCommand(String pos, String video_len) {
        int[] posSplit = lengthSplit(pos);
        posSplit[1] = posSplit[1] + 10;

        if (posSplit[1] >= 60) {
            posSplit[1] = posSplit[1] - 60;
            posSplit[0] = posSplit[0] + 1;
        }

        int[] videoLenSplit = lengthSplit(video_len);

        if (posSplit[0] >= videoLenSplit[0] && posSplit[1] >= videoLenSplit[1]) {
            return video_len;
        }

        return String.format("%s%s%s", convertToString(posSplit[0]), ":", convertToString(posSplit[1]));
    }

    private int[] lengthSplit(String length) {
        String[] split = length.split(":");

        return new int[] {Integer.valueOf(split[0]), Integer.valueOf(split[1])};
    }

    private String convertToString(int time) {
        String timeString = String.valueOf(time);
        if (time < 10) {
            timeString = String.format("%s%s", "0", timeString);
        }

        return timeString;
    }
}