import "strings"

func reverseSentence(s string) string {
	var result strings.Builder

	for i := len(s) - 1; i >= 0; i-- {
		result.WriteByte(s[i])
	}

	return result.String()
}

func reverseWords(s string) string {
	splits := strings.Split(s, " ")

	for i := 0; i < len(splits); i++ {
		splits[i] = reverseSentence(splits[i])
	}

	return strings.Join(splits, " ")
}