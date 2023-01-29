import "strings"

func interpret(command string) string {
	result := strings.Replace(command, "()", "o", -1)
	result = strings.Replace(result, "(al)", "al", -1)

	return result
}