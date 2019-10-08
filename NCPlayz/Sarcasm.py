import random
TEXT = this does not align with our core values
new_text = 
def choice(*args, **kwargs):
    return random.choice(*args, **kwargs)
def rand(val1, val2):
    return random.choice([val1, val2])
def upper(string):
    return string.upper()
def lower(string):
    return string.lower()
def upper_lower(string):
    return rand(upper, lower)(string)
def update_text(string):
    global new_text
    new_text = new_text + string
def main():
    for i in TEXT:
        update_text(upper_lower(i))
    print(new_text)
if __name__.upper() == '__MAIN__':
    main()
