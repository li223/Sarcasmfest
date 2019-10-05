static void Main(string[] _)
{
  var text = "this does not align with our core values".ToArray();
  for(var i = 1; i < text.Length; i++)
  {
    if (char.IsLower(text[i - 1])) text[i] = char.ToUpper(text[i]);
    else text[i] = char.ToLower(text[i]);
  }
  Console.WriteLine(string.Join("", text));
  Console.ReadLine();
}
