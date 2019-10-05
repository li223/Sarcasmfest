static void Main(string[] args)
{
  var sb = new StringBuilder();
  var text = "this does not align with our core values";
  sb.Append(text[0]);
  for(var i = 1; i < text.Length; i++)
  {
    if (Char.IsLower(sb.ToString()[i - 1])) sb.Append(Char.ToUpper(text[i]));
    else sb.Append(Char.ToLower(text[i]));
  }
  Console.WriteLine(sb.ToString());
  Console.ReadLine();
}
